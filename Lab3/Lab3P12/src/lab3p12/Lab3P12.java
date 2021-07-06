/*
Find GCD of two numbers using for loop and if statement.
 */
package lab3p12;

import java.util.Scanner;


public class Lab3P12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        int min;
        if (num1 < num2) {
            min = num1;
        } else {
            min = num2;
        }

        int gcd = 0;

        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.println("The GCD of the two numbers is " + gcd);
    }
    
}
