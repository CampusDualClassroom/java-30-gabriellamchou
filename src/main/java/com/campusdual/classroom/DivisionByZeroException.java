package com.campusdual.classroom;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String errorMessage){
        super(errorMessage);
    }
}