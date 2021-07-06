/*
Write a Java program to find a given number is palindrome or not. You have to take the
number in the range of integer.
Input Data:
Input number: 54789
Expected Output: Not a Palindrome.
Input number: 02022020
Expected Output: It is a Palindrome.
 */
package lab3p8;

import java.util.Scanner;

public class Lab3P8 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number:");
        int num = input.nextInt();

        int reversedInteger = 0, remainder, originalInteger;

        originalInteger = num;

        while (num != 0) {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num /= 10;
        }

        if (originalInteger == reversedInteger) {
            System.out.println(originalInteger + " is a palindrome.");
        } else {
            System.out.println(originalInteger + " is not a palindrome.");
        }
    }
}
