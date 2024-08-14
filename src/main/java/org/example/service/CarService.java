package org.example.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(scopeName = "prototype")
public class CarService {
    public CarService() {
        System.out.println("CarService object created");
    }
}
