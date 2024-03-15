package org.example.model;

public class Car {

    public static long nextId = 1;
    private long carId;
    String brand;
    int year;
    int price;
    int amount;

    Car(){}


    public Car(String brand , int year , int price , int amount){
        this.carId = nextId++;
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.amount = amount;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public long getCarId() {
        return carId;
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
