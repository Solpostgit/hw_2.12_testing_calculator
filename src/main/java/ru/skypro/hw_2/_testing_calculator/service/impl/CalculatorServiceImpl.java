package ru.skypro.hw_2._testing_calculator.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.hw_2._testing_calculator.service.CalculatorService;
@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public int minus(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public double divide(Integer num1, Integer num2) {
        return (double) num1 / num2;
    }
}
