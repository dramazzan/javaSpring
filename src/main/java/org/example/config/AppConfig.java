package org.example.config;

import org.example.model.Basket;
import org.example.model.Car;
import org.example.model.Client;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

@Configurable
public class AppConfig {

    @Bean(value = "Basket")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Basket basket(){return new Basket();}

    @Bean(value = "Toyota")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Car createToyota(){return new Car("Toyota", 2019 , 30000 , 3);}

    @Bean(value = "Ferrari")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Car createFerrari(){return new Car("Ferrari" , 2020 , 300000 ,0);}

    @Bean(value = "Ramazan")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Client createRamazan(){return new Client("Ramazan" , 19 , basket());}


    @Bean(value = "Dimash")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Client createDimash(){return new Client("Dimash", 18 , basket());}
}
