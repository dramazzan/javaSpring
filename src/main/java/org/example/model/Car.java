package org.example.model;

public class Car {

    String brand;
    int year;
    int price;

    Car(){}


    public Car(String brand , int year , int price ){
        this.brand = brand;
        this.year = year;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
