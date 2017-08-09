/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.project.framework.configuration;

import java.util.Properties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import static org.hibernate.cfg.Environment.*;

/**
 *
 * @author Rafael Benavides
 */
@Configuration
@EnableTransactionManagement
@PropertySource("classpath:db.properties")
@ComponentScan(basePackages = {"com.project.framework.dao","com.project.framework.service"})
public class DBConfig {
    
    @Autowired
    private Environment env;
    
    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
        
        Properties props = new Properties();
        props.put(DRIVER, env.getProperty("postgresql.driver"));
        props.put(URL, env.getProperty("postgresql.url"));
        props.put(USER, env.getProperty("postgresql.user"));
        props.put(PASS, env.getProperty("postgresql.password"));

        props.put(DIALECT, env.getProperty("hibernate.dialect"));
        props.put(USE_SQL_COMMENTS, env.getProperty("hibernate.use_sql_comments"));
        props.put(SHOW_SQL, env.getProperty("hibernate.show_sql"));
        props.put(FORMAT_SQL, env.getProperty("hibernate.format_sql"));
        props.put(DEFAULT_SCHEMA, env.getProperty("hibernate.default_schema"));
        props.put(HBM2DDL_AUTO, env.getProperty("hibernate.hbm2ddl.auto"));

        props.put(C3P0_MIN_SIZE, env.getProperty("hibernate.c3p0.min_size"));
        props.put(C3P0_MAX_SIZE, env.getProperty("hibernate.c3p0.max_size"));
        props.put(C3P0_ACQUIRE_INCREMENT, env.getProperty("hibernate.c3p0.acquire_increment"));
        props.put(C3P0_TIMEOUT, env.getProperty("hibernate.c3p0.timeout"));
        props.put(C3P0_MAX_STATEMENTS, env.getProperty("hibernate.c3p0.max_statements"));

        factoryBean.setHibernateProperties(props);
        factoryBean.setPackagesToScan("com.project.framework.model");
        return factoryBean;
    }
    
    @Bean
    public HibernateTransactionManager getTransactionManager() {
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(getSessionFactory().getObject());
        return transactionManager;
    }
}
