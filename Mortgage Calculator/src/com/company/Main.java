package com.company;

import java.text.Format;
import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        int principal = scanner.nextInt();
        System.out.print("Anual Interest rate: ");
        float monthlyRate = (scanner.nextFloat()/100) /12;
        System.out.print("Period (Years): ");
        int years = scanner.nextInt()*12;

        float result = (float) (principal * ((monthlyRate * (Math.pow((1+monthlyRate),years)))
                        / (Math.pow((1+monthlyRate),years)-1)));

        System.out.println(NumberFormat.getCurrencyInstance().format(result));


    }
}
