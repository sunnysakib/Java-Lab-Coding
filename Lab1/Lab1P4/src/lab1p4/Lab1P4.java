/*
Given an integer, create a function that returns the next prime. If the number is prime, 
return the number itself.
Examples
nextPrime(12) ➞ 13
nextPrime(24) ➞ 29
nextPrime(11) ➞ 11
// 11 is a prime, so we return the number itself.
 */
package lab1p4;

import java.util.Scanner;

public class Lab1P4 {

    public static int nextPrime(int num) {

        for (int i = num;; i++) {
            if (isPrime(i)) {
                return i;
            }
        }
    }

    public static boolean isPrime(int num) {

        int sqrtOfNumber = (int) Math.sqrt(num);

        for (int i = 2; i <= sqrtOfNumber; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int nextPrimeNumber = nextPrime(num);

        System.out.println("Next Prime Number is: " + nextPrimeNumber);

    }
}
