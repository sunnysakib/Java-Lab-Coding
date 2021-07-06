/*
Write a Java program that accepts two integer values between 25 to 75 and return true if 
there is a common digit in both numbers.
Sample Output: 
Input the first number : 35 
Input the second number: 45 
Result: true
 */
package lab1p19;

import java.util.Scanner;

public class Lab1P19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        if (num1 > 25 && num1 < 75 && num2 > 25 && num2 < 75) {
            int a = num1 % 10;
            int b = num2 % 10;
            int c = num1 / 10;
            int d = num2 / 10;

            if (a == b || a == d || b == c || c == d) {
                System.out.println(true);
            } else {
                System.out.println(true);
            }
        } else {
            System.out.println("Invalid!! enter number between 25 and 75");
        }

    }

}
