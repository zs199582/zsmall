/**
 * @(#)ExcelColumn.java, 2019-01-04.
 * <p/>
 */
package com.zsmall;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * excel 封装
 * 
 * @author dongxingong on 2019-01-04
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelColumn {
    /**
     * excel 表头
     * @return
     */
    String title() default "";

    /**
     * 是否动态表头
     * @return
     */
    boolean dynamic() default false;

    /**
     * 是否可编辑,excel解析无关字段
     * @return
     */
    boolean edit() default false;

    /**
     * 标记类型,excel解析无关字段
     * @return
     */
    String type() default "";

    /**
     * 是否折叠, excel解析无关字段
     * @return
     */
    boolean expand() default false;

    /**
     * hover字符串, excel解析无关字段
     * @return
     */
    String hoverMsg() default "";

}
