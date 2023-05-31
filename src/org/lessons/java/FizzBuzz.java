package org.lessons.java;

import java.util.Scanner;


public class FizzBuzz {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);
        int printNumber;
        int totalNumber;

        System.out.print("Numeri da stampare: ");
        totalNumber = keyboardReader.nextInt();

        while (totalNumber < 0 || totalNumber > 1000) {

            System.out.println("Numero non valido");
            System.out.print("Numeri da stampare: ");
            totalNumber = keyboardReader.nextInt();
        }

        for (int i = 0; i < totalNumber; i++) {
            printNumber = i + 1;
            if (printNumber % 3 == 0 && printNumber % 5 != 0) {
                System.out.println("Fizz");
            } else if (printNumber % 5 == 0 && printNumber % 3 != 0) {
                System.out.println("Buzz");
            } else if (printNumber % 5 == 0 && printNumber % 3 == 0) {
                System.out.println("FizzBuzz");
            } else {
                System.out.println(printNumber);
            }
        }
    }
}

