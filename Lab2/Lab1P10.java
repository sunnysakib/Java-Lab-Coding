/*
Write a Java program that takes three numbers as input to calculate and print the average 
of the numbers.

 */
package lab1p10;

import java.util.Scanner;

public class Lab1P10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int num1 = input.nextInt();
        System.out.println("Enter 2nd number: ");
        int num2 = input.nextInt();
        System.out.println("Enter 3rd number: ");
        int num3 = input.nextInt();

        float average =  (float)((num1 + num2 + num3) / 3.0);
        System.out.println("Average number is " + average);
    }

}
