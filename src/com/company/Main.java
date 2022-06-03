package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int money = 10000;
        Stuff.deposit(money);
        System.out.println(money);
        int[] values = {1, 2, 4, 5, 6, 7, 8, 9};
        System.out.println("main values is " + values);
        Stuff.deposit2(values);

    }
}
