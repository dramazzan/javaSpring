package org.example;

import org.example.config.AppConfig;
import org.example.model.Car;
import org.example.model.Client;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        SpringApplication.run(Main.class, args);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Car car = (Car)context.getBean("Toyota");
        Car car2 = (Car)context.getBean("Ferrari");

        Client firstclient = (Client)context.getBean("Ramazan");
        Client secondClient = (Client)context.getBean("Dimash");


        firstclient.addToBasket(car);
        firstclient.addToBasket(car2);
        secondClient.addToBasket(car);

        System.out.println(firstclient);

        firstclient.getBasket();








    }
}