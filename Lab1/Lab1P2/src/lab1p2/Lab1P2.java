/* 
A school has following rules for grading system:
a. Below 25 - F
b. 25 to 45 - E
c. 45 to 50 - D
d. 50 to 60 - C
e. 60 to 80 - B
f. Above 80 - A
Ask user to enter marks and print the corresponding grade

 */
package lab1p2;

import java.util.Scanner;

public class Lab1P2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Marks");
        int a = input.nextInt();

        if (a >= 0 && a < 25) {
            System.out.println("F");
        } else if (a >= 25 && a < 45) {
            System.out.println("E");
        } else if (a >= 45 && a < 50) {
            System.out.println("D");
        } else if (a >= 50 && a < 60) {
            System.out.println("C");
        } else if (a >= 60 && a < 80) {
            System.out.println("B");
        } else if (a >= 80 && a <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Invalid Number");
        }
    }

}
