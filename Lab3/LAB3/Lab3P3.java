/*
Write a program called SquarePattern that prompts user for the size (a non-negative
integer in int); and prints the following square pattern using two nested for-loops.
Enter the size: 5
# # # # #
# # # # #
# # # # #
# # # # #
# # # # #
 */
package lab3p3;

import java.util.Scanner;

public class Lab3P3 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = input.nextInt();

        if (n > 0) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("# ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Please!! enter positive interger");
        }
    }

}
