package com.example.pack2;

import com.example.pack1.Address;
import com.example.pack1.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;


@Configuration  // indicates that this class bean definitins
public class AppConfig {


    @Bean
    public Address address()
    {
        return new Address();
    }


//    @Bean
//    public DataSource dataSource()
//    {
//        DriverManagerDataSource dataSource = new DriverManagerDataSource();
//        dataSource.setDriverClassName("");
//        dataSource.setUrl(" jdbc:postgresql://localhost:5432/postgres");
//        dataSource.setUsername("admin");
//        dataSource.setPassword("admin");
//        return dataSource;
//    }
}
