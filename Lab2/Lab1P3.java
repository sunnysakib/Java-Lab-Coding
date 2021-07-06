/*
Create a function that takes two numbers as arguments and returns 
the GCD of the two numbers.
Examples
gcd(3, 5) ➞ 1
gcd(14, 28) ➞ 14
gcd(4, 18) ➞ 2
 */
package lab1p3;

import java.util.Scanner;

public class Lab1P3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter Second Number: ");
        int num2 = input.nextInt();

        int GCD = gcd(num1, num2); //funtion call

        System.out.println("The GCD of the two numbers is " + GCD);
    }

    public static int gcd(int num1, int num2) {
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
        return gcd;
    }

}
