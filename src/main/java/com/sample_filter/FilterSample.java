package com.sample_filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter("/*")
public class FilterSample implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {}

    @Override
    public void doFilter(ServletRequest aServletRequest, ServletResponse aServletResponse, FilterChain aFilterChain) throws IOException, ServletException {
        aServletRequest.setCharacterEncoding("UTF-8");
        aFilterChain.doFilter(aServletRequest, aServletResponse);
    }

    @Override
    public void destroy() {}
}
