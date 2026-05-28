package com.my.company.service;

import org.springframework.stereotype.Service;

@Service
public class ArithService {

    public void checkPositiveNumber(Double a, Double b) {
        if(a<0 || b<0){
            throw new IllegalArgumentException("Number can't be negative");
        }
    }

    public Double add(Double a,Double b){
        checkPositiveNumber(a,b);
        return a + b;
    }

    public Double  subtract(Double a,Double b){
        checkPositiveNumber(a,b);
        return a - b;
    }

    public Double multiply(Double a,Double b){
        return a * b;
    }

    public Double division(Double a,Double b){
        checkPositiveNumber(a,b);
        return a / b;
    }
}
