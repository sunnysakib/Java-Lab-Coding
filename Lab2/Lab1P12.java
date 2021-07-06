/*
 Write a Java program to swap two variables.
 */
package lab1p12;

import java.util.Scanner;

public class Lab1P12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = input.nextInt();
        System.out.print("Enter number a : ");
        int b = input.nextInt();
        System.out.println("Before Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int c = a;
        a = b;
        b = c;
        System.out.println("After Swap");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
