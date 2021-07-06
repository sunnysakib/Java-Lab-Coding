/*
Create a function that finds how many prime numbers there are, up to the given integer.
Examples
primeNumbers(10) ➞ 4
// 2, 3, 5 and 7
primeNumbers(20) ➞ 8
// 2, 3, 5, 7, 11, 13, 17 and 19
primeNumbers(30) ➞ 10
// 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29
 */
package lab1p8;

import java.util.Scanner;

public class Lab1P8 {

    static int primeNumber(int num) {
        int d = 0;
        for (int i = 2; i <= num; i++) {
            int c = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 00) {
                    c++;
                }
            }
            if (c < 2) {
                d++;
            }
        }
        return d;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int a = primeNumber(num);
        System.out.println("total prime number is: " + a);
        for (int i = 2; i <= num; i++) {
            int c = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 00) {
                    c++;
                }
            }
            if (c < 2) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

    }

}
