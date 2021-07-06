/*
Write a Java program that takes a year from user and print whether that year is a leap year
or not.
Test Data
Input the year: 2016
Expected Output:
2016 is a leap year
 */
package lab3p18;

import java.util.Scanner;

public class Lab3P18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any year: ");
        int year = input.nextInt();

        if (year % 400 == 0) {
            System.out.println(year + "year is leap year");
        } else if (year % 4 == 0) {
            System.out.println(year + " year is leap year");
        } else if (year % 100 == 0) {
            System.out.println(year + "yaer is leap year ");
        } else {
            System.out.println(year + " year is not leap year");
        }
    }

}
