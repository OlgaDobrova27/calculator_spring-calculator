package com.skypro.calculator_spring.serviceCalculator;

import org.springframework.stereotype.Service;

@Service
public class ServiceCalculator {


    public Integer aPlusB(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Введите параметр");
        }
        return a + b;
    }

    public Integer aMinusB(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Введите параметр");
        }
        return a - b;
    }

    public Integer aMultiplyB(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Введите параметр");
        }
        return a * b;
    }
    public Double aDivideB(Integer a, Integer b) {
        if (a == null || b == null) {
            throw new IllegalArgumentException("Введите параметр");
        }
        if (b == 0) {
            throw new RuntimeException("На ноль делить нельзя");
        }
        return (double) a / b;
    }

}
