/*
Write a Java Program to Find Factorial of a Number.
 */
package lab3p14;

import java.util.Scanner;

public class Lab3P14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }
        System.out.println(num + " Factorial is " + factorial);
    }

}
