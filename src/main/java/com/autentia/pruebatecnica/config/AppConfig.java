package com.autentia.pruebatecnica.config;

import javax.sql.DataSource;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@MapperScan("com.autentia.pruebatecnica")
public class AppConfig {
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource sdds = new DriverManagerDataSource();
        sdds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        sdds.setUrl("jdbc:mysql://localhost:3306/autentia?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
        sdds.setUsername("root");
        sdds.setPassword("");
        return sdds;
    }

    @Bean
    public DataSourceTransactionManager transactionManager(DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean
    public SqlSessionFactoryBean sqlSessionFactory(DataSource dataSource){
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource);
        return sessionFactory;
    }
}
