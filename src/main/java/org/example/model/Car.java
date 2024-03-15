package org.example.model;

import jakarta.persistence.*;

@Table(name = "car_table")
@Entity
public class Car {


    @Id
    @GeneratedValue
    @Column(name = "id")
    private long carId;

    @Column(name = "brand")
    String brand;
    int year;
    int price;
    int amount;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

   public Car(){}


    public Car(String brand , int year , int price , int amount){
        this.brand = brand;
        this.year = year;
        this.price = price;
        this.amount = amount;
    }


    public void setCarId(long carId) {
        this.carId = carId;
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
