package com.company;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        int rem;
        int rev = 0;
        int userInput;
        int number;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 5 digit number ");
        number = keyboard.nextInt();

        userInput = Integer.toString(number).length();
        int originalNumber = number;
        if (userInput > 5) {
            System.out.println("Entered number is greater than 5");
            return;
        }

        while (number > 0) {
            rem = number % 10;
            rev = (rev * 10) + rem;
            number /= 10;
        }

        if (originalNumber == rev) {

            System.out.println("palindrome " + originalNumber);

        } else {

            System.out.println("not palindrome " + originalNumber);

        }
    }
}
