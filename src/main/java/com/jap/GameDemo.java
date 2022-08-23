package com.jap;

import java.util.Scanner;

public class GameDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number");
        int secondNumber = scanner.nextInt();

        GameDemo gameDemo = new GameDemo();
        System.out.println("Result = " + gameDemo.divideByNumber(firstNumber, secondNumber));

    }

    public String divideByNumber(int firstNumber, int secondNumber) {
        int finalNumber = 0;
        try {
            finalNumber = firstNumber / secondNumber;
        } catch (ArithmeticException e) {
            return e.toString();
        }

        return String.valueOf(finalNumber);
    }

}
