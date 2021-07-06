/*
Write a Java program to compute the sum of the first 100 prime numbers.
Sample Output: 
Sum of the first 100 prime numbers: 24133
 */
package lab1p20;

import java.util.Scanner;

public class Lab1P20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        int d = 0;
        int sum = 0;
        for (int i = 2; d < num; i++) {
            int c = 0;
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c < 2) {
                sum = sum + i;
                d++;
            }

        }
        System.out.println("Sum of the first 100 prime numbers: " + sum);
    }

}
