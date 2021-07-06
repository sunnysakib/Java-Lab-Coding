/*
Write a Java program by using three for loops to print the following pattern:
1******
12*****
123****
1234***
12345**
123456*
1234567
 */
package lab3p7;

import java.util.Scanner;

public class Lab3P7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = input.nextInt();

        if (n > 0) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j);
                }
                for (int k = 1; k <= n - i; k++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Please!! enter positive integer");
        }
    }

}
