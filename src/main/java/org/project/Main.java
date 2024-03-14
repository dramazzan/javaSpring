package org.project;

import org.project.Config.AppConfig;
import org.project.Model.Basket;
import org.project.Model.Car;
import org.project.Model.Client;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Client firstClient = (Client)context.getBean("Client");
        System.out.println(firstClient+"\n");
        Car car = (Car)context.getBean("Car");
        System.out.println(car+"\n");
        Basket basket = (Basket)context.getBean("Basket");

        firstClient.buyCar(car);

        System.out.println(basket+"\n");








    }

}
