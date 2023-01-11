package com.skypro.calculator_spring.controllerCalculator;

import com.skypro.calculator_spring.serviceCalculator.ServiceCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class ControllerCalculator {

    private ServiceCalculator serviceCalculator = new ServiceCalculator();

    public ControllerCalculator(ServiceCalculator serviceCalculator) {
        this.serviceCalculator = serviceCalculator;
    }

    @GetMapping
    public String showHelloInfo(){
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String plus(Integer a, Integer b){
        return a + " + " + b + " = " + serviceCalculator.aPlusB(a, b);
    }

    @GetMapping("/minus")
    public String minus(Integer a, Integer b){
        return a + " - " + b + " = " + serviceCalculator.aMinusB(a, b);
    }

    @GetMapping("/multiply")
    public String multiply(Integer a, Integer b){
        return a + " * " + b + " = " + serviceCalculator.aMultiplyB(a, b);
    }

    @GetMapping("/divide")
    public String divide(Integer a, Integer b){
        return a + " / " + b + " = " + serviceCalculator.aDivideB(a, b);
    }



}
