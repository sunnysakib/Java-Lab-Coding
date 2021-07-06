/*
Write a Java program that takes an integer number between 1 to 7 and displays the name
of the weekday.
Test Data
Input number: 3
Expected Output:
Wednesday
 */
package lab3p17;

import java.util.Scanner;

public class Lab3P17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter any key 1 to 7: ");
        int num = input.nextInt();

        switch (num) {
            case 7: {
                System.out.println("Sunday");
                break;
            }
            case 1: {
                System.out.println("Monday");
                break;
            }
            case 2: {
                System.out.println("Tuesday");
                break;
            }
            case 3: {
                System.out.println("Wednesday");
                break;
            }
            case 4: {
                System.out.println("Thuresday");
                break;
            }
            case 5: {
                System.out.println("Friday");
                break;
            }
            case 6: {
                System.out.println("Saterday");
                break;
            }
        }
    }

}
