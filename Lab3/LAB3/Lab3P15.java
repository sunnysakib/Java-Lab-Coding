/*
Write a java program to reverse a Number using a do while loop.
Input Data:
Input number: 54789
Expected Output
The reversed number is : 98745
 */
package lab3p15;

import java.util.Scanner;

public class Lab3P15 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int newNum = 0;

        if (num < 0) {
            newNum = (-1) * num;
        } else {
            newNum = num;
        }
        System.out.print("The reversed number is: ");
        int i = 10;
        do {
            int r = newNum % i;
            System.out.print(r);
            newNum = newNum / i;
        } while (newNum > 10);

        System.out.println(newNum);
    }

}
