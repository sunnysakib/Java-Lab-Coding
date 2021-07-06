/*
Write a Java program that takes two numbers as input and display 
the product of two numbers.
Test Data:
Input first number: 25
Input second number: 5
Expected Output:
25 x 5 = 125
 */
package lab1p5;

import java.util.Scanner;

public class Lab1P5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        
        int product = num1 * num2;
        System.out.println(num1 + " x " + num2 + " = " + product);
    }

}
