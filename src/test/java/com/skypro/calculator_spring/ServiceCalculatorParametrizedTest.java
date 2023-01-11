package com.skypro.calculator_spring;

import com.skypro.calculator_spring.serviceCalculator.ServiceCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static com.skypro.calculator_spring.ServiceCalculatorTest.A;
import static com.skypro.calculator_spring.ServiceCalculatorTest.B;

public class ServiceCalculatorParametrizedTest {

    private final ServiceCalculator serviceCalculator = new ServiceCalculator();

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldResultAPlusB(Integer input1, Integer input2){
        Assertions.assertEquals(serviceCalculator.aPlusB(input1,input2),input1 + input2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldResultAMinusB(Integer input1, Integer input2){
        Assertions.assertEquals(serviceCalculator.aMinusB(input1,input2),input1 - input2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldResultAMultiplyB(Integer input1, Integer input2){
        Assertions.assertEquals(serviceCalculator.aMultiplyB(input1,input2),input1 * input2);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForTest")
    public void shouldResultADivideB(Integer input1, Integer input2){
        Assertions.assertEquals(serviceCalculator.aDivideB(input1,input2),(double) input1 / input2);
    }

    public static Stream<Arguments> provideParamsForTest(){
        return  Stream.of(
                Arguments.of(A,B),
                Arguments.of(12,4)
        );
    }
}
