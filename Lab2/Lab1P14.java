/*
Write a Java program and compute the sum of the digits of an integer. 
Input Data: 
Input an integer: 25 
Expected Output 
The sum of the digits is: 7
 */
package lab1p14;

import java.util.Scanner;

public class Lab1P14 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int integer = input.nextInt();

        int a = integer % 10;
        int b = integer / 10;

        int sum = a + b;

        System.out.println("sum is " + sum);
    }

}
