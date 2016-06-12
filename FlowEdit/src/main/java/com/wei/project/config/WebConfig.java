package com.wei.project.config;

import freemarker.template.utility.XmlEscape;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfig;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cw on 6/12/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan("com.wei.project")

public class WebConfig extends WebMvcConfigurerAdapter{

    @Bean
    public FreeMarkerConfig freeMarkerConfigurer(){

        FreeMarkerConfigurer f = new FreeMarkerConfigurer();
        f.setTemplateLoaderPath("/WEB-INF/views/");
        Map<String, Object> vars = new HashMap<String, Object>();
        vars.put("xml_escape", new XmlEscape());
        vars.put("default_encoding", "UTF-8");
        f.setFreemarkerVariables(vars);
        return f;
    }

    @Bean
    public FreeMarkerViewResolver freeMarkerViewResolver() {
        FreeMarkerViewResolver f = new FreeMarkerViewResolver();
        f.setPrefix("");
        f.setSuffix(".ftl");
        return f;
    }

}
