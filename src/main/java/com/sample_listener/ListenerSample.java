package com.sample_listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class ListenerSample implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent aSce) {
        ServletContext context = aSce.getServletContext();
        Integer count = 0;
        context.setAttribute("count", count);
    }

    @Override
    public void contextDestroyed(ServletContextEvent aSce) {
    }
}
