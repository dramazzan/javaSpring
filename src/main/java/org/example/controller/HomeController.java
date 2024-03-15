package org.example.controller;

import org.example.model.Car;
import org.example.model.Client;
import org.example.repository.CarRepository;
import org.example.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    private final CarService carService;

    public HomeController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping
    public String getHome(){
        return "Hello Welcome Home!";
    }

    @GetMapping("/{name}")
    public String greetingToUser(@PathVariable String name){
        return "Hello " + name + "!";
    }

    @PostMapping("/car")
    public String addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @GetMapping("/car")
    public List<Car> getAllCars(){
        return carService.getAllCar();
    }


}
