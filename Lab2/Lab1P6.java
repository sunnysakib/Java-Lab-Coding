/*
Write a Java program to print the sum (addition), multiply, subtract, 
divide and remainder of two numbers. 
Test Data: 
Input first number: 125 
Input second number: 24 
Expected Output: 
125 + 24 = 149 
125 - 24 = 101 
125 x 24 = 3000 
125 / 24 = 5
 */
package lab1p6;

import java.util.Scanner;

public class Lab1P6 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();
        
        int sum = num1 + num2;
        int subtract = num1 - num2;
        int multiply = num1*num2;
        int divide = num1/num2;
        
        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        System.out.println(num1 + " x " + num2 + " = " + multiply);
        System.out.println(num1 + " / " + num2 + " = " + divide);
    }
    
}
