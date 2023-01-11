package com.skypro.calculator_spring;

import com.skypro.calculator_spring.serviceCalculator.ServiceCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ServiceCalculatorTest {
    private ServiceCalculator serviceCalculator = new ServiceCalculator();
    public static final Integer A = 5;
    public static final Integer B = 1;
    private final Integer ILLEGAL_VALUE_ZERO = 0;

    @Test
    public void shouldResultAPlusB(){
        Integer expected = serviceCalculator.aPlusB(A,B);
        Integer actual = A + B;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldResultAMinusB(){
        Integer expected = serviceCalculator.aMinusB(A,B);
        Integer actual = A - B;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldResultAMultiplyB(){
        Integer expected = serviceCalculator.aMultiplyB(A,B);
        Integer actual = A * B;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldResultADivideB(){
        Double expected = serviceCalculator.aDivideB(A,B);
        Double actual = (double) A / B;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionThenADivideForZero(){
        Assertions.assertThrows(RuntimeException.class, () -> serviceCalculator.aDivideB(A,ILLEGAL_VALUE_ZERO));
    }

}
