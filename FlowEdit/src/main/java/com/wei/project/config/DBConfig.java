package com.wei.project.config;

import com.wei.project.dao.UserDAO;
import com.wei.project.dao.UserDAOImpl;
import com.wei.project.entities.User;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;

import javax.sql.DataSource;
import java.util.Properties;

/**
 * Created by cw on 6/14/16.
 */
@Configuration
@ComponentScan("com.wei.project")
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

    @Autowired
    @Bean
    public SessionFactory getSessionFactory(DataSource dataSource){
        LocalSessionFactoryBuilder dbsession = new LocalSessionFactoryBuilder(dataSource);
        dbsession.addAnnotatedClass(User.class);
        dbsession.addProperties(getHibernateProperties());

        return dbsession.buildSessionFactory();

    }
    private Properties getHibernateProperties(){

        Properties p = new Properties();
        p.put("hibernate.dialet", "org.hibernate.dialect.MySQLDialect");
        p.put("hibernate.show_sql", "false");
        return  p;
    }

    @Autowired
    @Bean
    public UserDAO getUserDao(SessionFactory sessionFactory){
        UserDAOImpl t = new UserDAOImpl();
        t.setSessionFactory(sessionFactory);

        return t;
    }
}
