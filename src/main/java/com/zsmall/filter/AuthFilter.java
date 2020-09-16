package com.zsmall.filter;

import com.sun.net.httpserver.HttpExchange;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author zhangshuo7@corp.netease.com
 */
public class AuthFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

    }
}
