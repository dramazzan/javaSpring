package org.example.model;

import jakarta.persistence.*;


@Entity
@Table(name = "client_table")
public class Client {

    @OneToOne(mappedBy = "basket")
    private Basket basket;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long clientId;
    @Column(name = "client_name")
    private String name;
    private int age;

    public Client() {

    }

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
        this.basket = basket;
    }


    public void addToBasket(Car car) {
        basket.addCar(car);
        System.out.println("'" + name + "' you have successfully added a '" + car.brand + "' to your cart");
    }

    public void buyCar(Car car) {
        if (car.amount > 0) {
            System.out.println("'" + name + "' you are successfully bought '" + car.brand + "'");
            car.amount--;
        } else {
            System.out.println("the '" + car.brand + "' is over");
        }
    }


    public void getBasket() {
        System.out.println(name + "-" + basket);
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return clientId;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
