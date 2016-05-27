package com.wei.test.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by cw on 5/27/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.wei.test.web")
public class WebConfig extends WebMvcConfigurerAdapter{

  @Bean
  public ViewResolver viewResolver(){
    InternalResourceViewResolver resolver = new InternalResourceViewResolver();
    resolver.setPrefix("/WEB-INF/views/");
    resolver.setSuffix(".jsp");
    resolver.setExposeContextBeansAsAttributes(true);
    return resolver;

  }

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){
    configurer.enable();
  }

}
