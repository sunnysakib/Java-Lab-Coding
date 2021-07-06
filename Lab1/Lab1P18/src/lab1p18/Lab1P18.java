/*
Write a Java program that accepts three integer values and return true if one of them is 20 
or more and less than the subtractions of others.
Sample Output: 
Input the first number: 15 
Input the second number: 20 
Input the third number: 25 
false
 */
package lab1p18;

import java.util.Scanner;

public class Lab1P18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter third number: ");
        int num3 = input.nextInt();
        int sub = 0;
        int max;
        if (num1 > num2) {
            if (num1 > num3) {
                max = num1;
                if (num2 > num3) {
                    sub = num2 - num3;
                } else {
                    sub = num3 - num2;
                }
            } else {
                max = num3;
                sub = num1 - num2;
            }
        } else {
            if (num2 > num3) {
                max = num2;
                if (num1 > num3) {
                    sub = num1 - num3;
                } else {
                    sub = num3 - num1;
                }
            } else {
                max = num3;
                sub = num2 - num1;
            }
        }

        if (max >= 20 && max<sub) {
            System.out.println(true);
        } else{
            System.out.println(false);
        }
    }

}
