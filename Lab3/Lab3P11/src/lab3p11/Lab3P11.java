/*
Write a program to calculate the sum of following series where n is the input given by the
user.
1 + 1/2 + 1/3 + 1/4 + 1/5 +............1/n
 */
package lab3p11;

import java.util.Scanner;

public class Lab3P11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();
        float sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + (float) 1 / i;
        }
        System.out.println("factorial result is: " + sum);
    }

}
