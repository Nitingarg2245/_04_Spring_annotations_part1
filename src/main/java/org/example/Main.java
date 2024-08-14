package org.example;

import org.example.config.Config;
import org.example.service.CarService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ac=new AnnotationConfigApplicationContext(Config.class);
//default scope singleton design pattern so hashcode is same
//        CarService carService1=ac.getBean(CarService.class);
//        CarService carService2=ac.getBean(CarService.class);
//        System.out.println(carService1.hashCode());
//        System.out.println(carService2.hashCode());

        //lets use @scope to change it to prototype then we will have different hashcode
        CarService carService1=ac.getBean(CarService.class);
        CarService carService2=ac.getBean(CarService.class);
        System.out.println(carService1.hashCode());
        System.out.println(carService2.hashCode());
    }
}