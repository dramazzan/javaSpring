package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Client {

    private String name;
    private int age;
    private Basket basket;

    public Client(String name, int age, Basket basket) {
        this.name = name;
        this.age = age;
        this.basket = basket;
    }

    public void addToBasket(Car car) {
        basket.addCar(car);
        System.out.println("'" + name + "' you have successfully added a '" + car.brand + "' to your cart");
    }

    public void buyCar(Car car){
        if(car.amount > 0){
            System.out.println("'"+name+"' you are successfully bought '"+car.brand+"'");
            car.amount--;
        }else{
            System.out.println("the '"+car.brand+"' is over");
        }
    }


    public void getBasket() {
        System.out.println(name + "-" + basket);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
