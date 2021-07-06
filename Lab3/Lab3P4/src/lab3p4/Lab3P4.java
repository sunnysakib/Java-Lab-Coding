/*
Write 3 programs that prompts user for the size (a non-negative integer in int); and prints
the pattern as shown:
Enter the rows: 6
a)         #            b)    # # # # # # # # # # #
         # # #                  # # # # # # # # #
       # # # # #                  # # # # # # #
     # # # # # # #                  # # # # #
   # # # # # # # # #                  # # #
 # # # # # # # # # # #                  #

 */
package lab3p4;

import java.util.Scanner;

public class Lab3P4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = input.nextInt();

        if (n > 0) {
            System.out.println("a");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = 1; k < 2 * i; k++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
            System.out.println("b");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= 2 * (n - i); k++) {
                    System.out.print("#");
                }
                System.out.println("");
            }
        } else {
            System.out.println("Please!! enter positive interger");
        }

    }

}
