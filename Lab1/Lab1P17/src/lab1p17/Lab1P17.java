/*
Write a Java program to calculate the sum of two integers and return true if the sum is 
equal to a third integer.
Sample Output: 
Input the first number : 5 
Input the second number: 10 
Input the third number : 15 
The result is: true

 */
package lab1p17;

import java.util.Scanner;

public class Lab1P17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();

        int sum = num1 + num2;

        if (sum == num3) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }

}
