package org.example.service;

import org.example.model.Car;
import org.example.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {

    private final CarRepository repository;

    public CarService(CarRepository repository) {
        this.repository = repository;
    }


    public String addCar(Car car){
        if(!car.getBrand().isBlank()){
            repository.save(car);
        }
        return "ADDED";

    }

    public List<Car> getAllCar(){
        return repository.findAll();
    }


}
