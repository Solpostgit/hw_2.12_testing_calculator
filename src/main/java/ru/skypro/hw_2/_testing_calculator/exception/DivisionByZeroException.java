package ru.skypro.hw_2._testing_calculator.exception;

public class DivisionByZeroException extends IllegalArgumentException{
    public DivisionByZeroException(String s) {
        super(s);
    }
}
