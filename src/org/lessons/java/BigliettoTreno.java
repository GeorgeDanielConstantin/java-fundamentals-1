package org.lessons.java;

import java.text.DecimalFormat;
import java.util.Scanner;


public class BigliettoTreno {
    public static void main(String[] args) {
        Scanner keyboardReader = new Scanner(System.in);
        DecimalFormat decimalFormat = new DecimalFormat("#.##");

        int km;
        int age;
        double pricePerKm = 0.21;
        double finalPrice;
        double underageDiscount = 0.8;
        double overageDiscount = 0.6;


        System.out.print("Km da percorrere: ");
        km = keyboardReader.nextInt();

        System.out.print("Età ");
        age = keyboardReader.nextInt();

        if (age < 18) {
            finalPrice = (km * pricePerKm) * underageDiscount;
        } else if (age > 64) {
            finalPrice = (km * pricePerKm) * overageDiscount;
        } else {
            finalPrice = km * pricePerKm;
        }
        System.out.println("Il prezzo è : " + decimalFormat.format(finalPrice) + " euro");
    }
}
