package org.project.Model;

import org.springframework.stereotype.Component;

import java.util.List;

public class Client {

    String name;
    int age;
    Basket basket;

    public Client(String name, int age){
        this.name = name;
        this.age = age;
        this.basket = new Basket();
    }

    public void buyCar(Car car){
        basket.addCar(car);
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
