package com.mycompany.dvdstore;

import com.mycompany.dvdstore.controller.MovieController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
@Configuration
@ComponentScan(basePackages = {"com.mycompany.dvdstore.repository.file","com.mycompany.dvdstore.controller","com.mycompany.dvdstore.service"})
@PropertySource("classpath:application.properties")
@ImportResource("classpath:applicationContext.xml")
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(App.class);
        MovieController movieController=context.getBean(MovieController.class);
        movieController.addUsingConsole();


    }
}
