/*
 * UCF COP3330 FALL 2021 Assignment 1 Solution
 * Copyright 2021 Alex Vorakrajangthiti
 */

import java.util.Scanner;

public class exercise14 {
    public static void main(String[] args) {

        System.out.printf("What is the order amount? ");
        Scanner scanner = new Scanner(System.in);
        String amount = scanner.nextLine();
        float newPrin = Float.parseFloat(amount);

        System.out.print("What is the state? ");
        Scanner scanner1 = new Scanner(System.in);
        String state = scanner1.nextLine();
        double WITAX = (0.055 * newPrin) + newPrin;
        if (state.equals("WI")) {
            System.out.printf("The subtotal is $%s.\nThe tax is $0.55.\nThe total is $%.2f.",amount,WITAX);
            System.exit(0);
        }
            System.out.printf("The total is $%.2f.", newPrin);

    }

}