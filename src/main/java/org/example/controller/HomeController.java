package org.example.controller;

import org.example.model.Car;
import org.example.model.Client;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    List<Car> carList = new ArrayList<>();

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
      return carList.add(car) ? "Added" : "Not Added";

    }

    @GetMapping("/car")
    public List<Car> getAllCars(){
        return carList;
    }

}
