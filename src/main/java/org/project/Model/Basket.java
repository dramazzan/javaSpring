package org.project.Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


public class Basket {

    List<Car> carList = new ArrayList<>();


    public Basket() {
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
