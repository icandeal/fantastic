package com.ycf.listener;

import org.apache.log4j.PropertyConfigurator;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by sniper on 16-9-1.
 */
public class Log4jInitListener implements ServletContextListener {
    public void contextInitialized(ServletContextEvent contextEvent) {
        PropertyConfigurator.configure(getClass().getResourceAsStream(contextEvent.getServletContext().getInitParameter("log4JConfigLocation")));
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
