package pro.sky.calculator.service;

import org.springframework.stereotype.Service;


public interface CalculatorService {
    String greeting();

    Integer plus(Integer num1, Integer num2);

    int minus(Integer num1, Integer num2);

    int multiply(Integer num1, Integer num2);

    int divide(Integer num1, Integer num2);
}
