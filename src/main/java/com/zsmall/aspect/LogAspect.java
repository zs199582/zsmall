package com.zsmall.aspect;
import com.zsmall.annotation.Log;
import com.zsmall.dao.SysLogDOMapper;
import com.zsmall.dataobject.SysLogDO;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.aspectj.lang.JoinPoint;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import sun.net.util.IPAddressUtil;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;

/**
 * @author zhangshuo7@corp.netease.com
 */
@Aspect
@Component
public class LogAspect {

    @Autowired
    private SysLogDOMapper sysLogDOMapper;

    @Pointcut("@annotation(com.zsmall.annotation.Log)")
    public void pointcut(){}

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinpoint){
        Object result = null;
        long beginTime = System.currentTimeMillis();
        try{
            result = joinpoint.proceed();
        }catch (Throwable e){
            e.printStackTrace();
        }
        long time = System.currentTimeMillis() - beginTime;
        saveLog(joinpoint,time);
        return result;
    }

    private void saveLog(ProceedingJoinPoint joinpoint,long time){
        MethodSignature signature = (MethodSignature)joinpoint.getSignature();
        Method method = signature.getMethod();
        SysLogDO sysLog = new SysLogDO();
        Log log = method.getAnnotation(Log.class);
        if(log!= null){
            //
            sysLog.setOperation(log.value());
        }
        String className = joinpoint.getTarget().getClass().getName();
        String methodName = method.getName();
        sysLog.setMethod(className+"."+methodName+"()");
        sysLog.setOperatime(time);
        sysLog.setCreateTime(System.currentTimeMillis());
        ServletRequestAttributes request = (ServletRequestAttributes)RequestContextHolder.getRequestAttributes();
        HttpServletRequest servletRequest = request.getRequest();
        sysLog.setIp("127.0.0.1");
        sysLog.setUsername("zs");
        sysLog.setParams("");
        sysLogDOMapper.insert(sysLog);
    }
}
