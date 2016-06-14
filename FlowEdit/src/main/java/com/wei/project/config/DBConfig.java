package com.wei.project.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

/**
 * Created by cw on 6/14/16.
 */
@Configuration
@ComponentScan("com.wei.project.config")
public class DBConfig {

    @Bean
    public DataSource dataSource(){

        DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();

        driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/spring");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("cwmena");
        return driverManagerDataSource;
    }

    @Bean
    @Autowired
    public LocalSessionFactoryBean getSessionFactory(DataSource dataSource){
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(dataSource);

        return sessionFactoryBean;

    }
}
