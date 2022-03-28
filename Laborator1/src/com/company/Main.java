package com.company;

import java.util.Scanner;

import static java.lang.Math.max;

public class Main {

    public static int factorial(int n) {
        if (n == 0)
            return 1;

        return n * factorial(n - 1);
    }

    public static int multSum(int n) {
        int sum = 0;

        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println("Enter a number n");

        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        //System.out.println(n);

        for (int i = 0; i <= n; i += 2) {
            System.out.println(i);
        }

        System.out.println("Enter 2 integers, a and b");
        int a = console.nextInt();
        int b = console.nextInt();

        System.out.println(Math.max(a, b));

        System.out.println("Enter a positive integer");

        n = console.nextInt();

        System.out.println(factorial(n));

        System.out.println("Enter a positive integer");

        n = console.nextInt();

        System.out.println(multSum(n));

        int[] even = new int[20];
        int[] odd = new int[20];

        System.out.println("Enter a positive integer n");

        n = console.nextInt();

        int cntEven = 0, cntOdd = 0;

        System.out.println("Enter n positive integers");
        for (int i = 0; i < n; i++) {
            int x = console.nextInt();

            if (x % 2 == 0) {
                even[cntEven++] = x;
            } else {
                odd[cntOdd++] = x;
            }
        }

        System.out.println("Even numbers:");
        for (int i = 0; i < cntEven; i++)
            System.out.println(even[i]);

        System.out.println("Odd numbers:");

        for (int i = 0; i < cntOdd; i++)
            System.out.println(odd[i]);

        System.out.println("Enter grades. When grade -1 is encountered, reading will stop");

        int x = 0;
        double sum = 0;
        int num = 0;
        while (true) {
            x = console.nextInt();

            if (x == -1)
                break;

            sum += x;
            num++;
        }

        System.out.print("The average of the grades is: ");
        System.out.println(sum / num);
    }
}
