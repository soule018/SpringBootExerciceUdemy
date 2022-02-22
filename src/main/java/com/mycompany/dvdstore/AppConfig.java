package com.mycompany.dvdstore;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstore.repository.file","com.mycompany.dvdstore.controller","com.mycompany.dvdstore.service"})
@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class AppConfig {
}
