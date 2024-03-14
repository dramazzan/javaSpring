package org.example.model;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    Client client;
    List<Car> carList;

    public Basket(){
        this.carList = new ArrayList<>();
    }

    public void addCar(Car car){
        carList.add(car);
    }

    @Override
    public String toString() {
        return "Basket{" +
                "carList=" + carList +
                '}';
    }
}
