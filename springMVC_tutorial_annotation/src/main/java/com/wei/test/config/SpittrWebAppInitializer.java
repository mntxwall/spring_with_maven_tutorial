package com.wei.test.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by cw on 5/27/16.
 */
public class SpittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
  protected Class<?>[] getRootConfigClasses() {
    return null;
  }

  protected Class<?>[] getServletConfigClasses() {
    return new Class<?>[] {WebConfig.class};
  }

  protected String[] getServletMappings() {
    return new String[] {"/"};
  }
}
