package pro.sky.calculator.service;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.calculator.service.serviceImpl.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceParamsTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideArgumentsForTestSum")
    public void shouldSum(int num1, int num2, int sum){
        int result = calculatorService.plus(num1,num2);
        Assertions.assertEquals(sum, result);
    }
    private static Stream<Arguments> provideArgumentsForTestSum(){
        return Stream.of(
                Arguments.of(1,2,3),
                Arguments.of(2,2,4),
                Arguments.of(5,2,7));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTestDiv")
    public void shouldDiv(int num1, int num2, int div){
        int result = calculatorService.divide(num1,num2);
        Assertions.assertEquals(div, result);
    }
    private static Stream<Arguments> provideArgumentsForTestDiv(){
        return Stream.of(
                Arguments.of(6,2,3),
                Arguments.of(14,2,7),
                Arguments.of(8,2,4));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForSubstr")
    public void shouldSubstract(int num1, int num2, int substr){
        int result = calculatorService.minus(num1,num2);
        Assertions.assertEquals(substr, result);
    }
    private static Stream<Arguments> provideArgumentsForSubstr(){
        return Stream.of(
                Arguments.of(5,2,3),
                Arguments.of(10,2,8),
                Arguments.of(9,2,7));
    }

    @ParameterizedTest
    @MethodSource("provideArgumentsForTestMult")
    public void shouldMult(int num1, int num2, int mult){
        int result = calculatorService.multiply(num1,num2);
        Assertions.assertEquals(mult, result);
    }
    private static Stream<Arguments> provideArgumentsForTestMult(){
        return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(3,5,15),
                Arguments.of(5,2,10));
    }
}
