package org.example.model;

import jakarta.persistence.*;
import org.hibernate.annotations.ListIndexBase;
import org.hibernate.annotations.NotFound;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="basket_table")
public class Basket {

    @OneToOne
    @JoinColumn(name = "client_id")
    private Client client;




    @Id
    @GeneratedValue
    @Column(name = "basket_id")
    private Long id;

    @OneToMany(mappedBy = "basket", cascade = CascadeType.ALL)
    private List<Car> carList;


    public Basket(Client client){
        this.client = client;
        this.carList = new ArrayList<>();
    }

    public Basket() {

    }

    public Client getClient(){
        return client;
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

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
