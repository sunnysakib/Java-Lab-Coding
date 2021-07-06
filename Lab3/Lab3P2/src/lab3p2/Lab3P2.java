/*
Write a program called Fibonacci to print the first 20 Fibonacci numbers F(n), where
F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their harmonic mean.
The output shall look like:
The first 20 Fibonacci numbers are:
1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
 */
package lab3p2;

import java.util.Scanner;

public class Lab3P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        int sum = 0;
        for (int i = 0; i <= num; i++) {

            if (c > 0) {
                System.out.print(c + " ");
            }

            a = b;
            b = c;
            c = a + b;

            sum = sum + (1 / c);
        }
        System.out.println(" ");
        int harmonicMean = num / sum;
        System.out.println("harmonic mean: " + harmonicMean);
    }

}
