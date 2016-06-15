package com.wei.project.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by cw on 6/12/16.
 */
public class FlowEditWebApp extends AbstractAnnotationConfigDispatcherServletInitializer{
    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[] {DBConfig.class, WebConfig.class};
        //return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        //return new Class<?>[] {WebConfig.class};
        return null;
    }

    protected String[] getServletMappings() {
        return new String[] {"/"};
    }
}
