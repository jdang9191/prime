/*-------------------------------------------------------------
// AUTHOR: Jonathan Dang
// FILENAME: Assigment4.java
// SPECIFICATION: program that determines whether inputted number is a prime number
// FOR: CS 1400- Assignment #4
// TIME SPENT: 1 hour
//-----------------------------------------------------------*/

import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        boolean quit = false;
        double average = 0;
        int sum = 0;
        int max = 0, min = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        int count = 0;

        while (choice != -1) {
            System.out.println("Enter a positive integer. Enter -1 to quit. ");
            choice = sc.nextInt();
            if (choice != -1) {
                boolean result = isPrime(choice);
                if (result) {
                    System.out.println("The number " + choice + " is a prime number.\n");

                } else {
                    System.out.println("The number " + choice + " is not a prime number.\n");
                }
                count++;
                sum += choice;
                max = Math.max(max, choice);
                min = Math.min(min, choice);
            } else {
                System.out.println();
            }
        }
        while (!quit) {
            switch (choice) {
                case -1:
                    quit = true;
                    System.out.println("The maximum positive number is: " + max);
                    System.out.println("The minimum positive number is: " + min);
                    System.out.println("The sum is: " + sum);
                    System.out.println("The count of number(s) is: " + count);
                    System.out.printf("The average is: %.2f\n", average(sum, count));

                    break;

            }

        }
        sc.close();
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static double average(int sum, int count) {
        return (double) (sum) / count;
    }

}
