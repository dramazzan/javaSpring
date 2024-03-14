package org.project.Config;

import org.project.Model.Basket;
import org.project.Model.Car;
import org.project.Model.Client;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfig {


    @Bean(value = "Client")
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    Client client(){return new Client("Ramazan" , 19);}

    @Bean(value = "Car")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Car car(){return new Car("Bmw", 10000);}

    @Bean(value = "Basket")
    @Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
    Basket basket(){return new Basket();}





}
