package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException(int dividend, int divisor) throws DivisionByZeroException {
        if (divisor == 0){
            throw new DivisionByZeroException("Error: Has intentado dividir por cero.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        int result;
        try {
            result = divisionWithCustomException(3, 0);
            System.out.println("Resultado: " + result);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
