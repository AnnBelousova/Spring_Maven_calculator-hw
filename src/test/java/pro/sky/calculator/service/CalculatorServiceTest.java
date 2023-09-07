package pro.sky.calculator.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.calculator.service.serviceImpl.CalculatorServiceImpl;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();
    @Test
    public void shouldReturnSumTwoNumbers(){
        int sum = calculatorService.plus(5,1);
        Assertions.assertEquals(6,sum);
    }

    @Test
    public void shouldReturnSubtractionTwoNumbers(){
        int subtraction = calculatorService.minus(5,1);
        Assertions.assertEquals(4,subtraction);
    }

    @Test
    public void shouldReturnDivTwoNumbers(){
        int div= calculatorService.divide(6,3);
        Assertions.assertEquals(2,div);
    }

    @Test
    public void shouldReturnMultiplicationTwoNumbers(){
        int multiplication= calculatorService.multiply(5,2);
        Assertions.assertEquals(10,multiplication);
    }

    @Test
    public void shouldReturnException(){
        Assertions.assertThrows(NullPointerException.class, ()->calculatorService.divide(5,0));
    }
}
