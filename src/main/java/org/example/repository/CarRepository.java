package org.example.repository;

import org.example.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository  extends JpaRepository<Car, Long> {

//    public List<Car> findCarByAmountContainsIgnoreCase(String brand);

}
