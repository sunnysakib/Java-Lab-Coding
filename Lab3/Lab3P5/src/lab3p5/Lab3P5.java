/*
Write 4 programs that prompts user for the size (a non-negative integer in int); 
and prints the pattern as shown:
Enter the size: 8
1                    1 2 3 4 5 6 7 8                1      8 7 6 5 4 3 2 1
1 2                  1 2 3 4 5 6 7                2 1      7 6 5 4 3 2 1
1 2 3                1 2 3 4 5 6                3 2 1      6 5 4 3 2 1
1 2 3 4              1 2 3 4 5                4 3 2 1      5 4 3 2 1
1 2 3 4 5            1 2 3 4                5 4 3 2 1      4 3 2 1
1 2 3 4 5 6          1 2 3                6 5 4 3 2 1      3 2 1
1 2 3 4 5 6 7        1 2                7 6 5 4 3 2 1      2 1
1 2 3 4 5 6 7 8      1                8 7 6 5 4 3 2 1      1
     (a)                (b)                  (c)               (d)
 */
package lab3p5;

import java.util.Scanner;

public class Lab3P5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int n = input.nextInt();

        if (n > 0) {
            // for a
            System.out.println("Example (a)");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }

            // for b
            System.out.println("");
            System.out.println("Example (b)");
            for (int i = 0; i < n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println("");
            }

            // for c
            System.out.println("");
            System.out.println("Example (c)");
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k >= 1; k--) {
                    System.out.print(k);
                }
                System.out.println("");
            }

            // for d
            System.out.println("");
            System.out.println("Example (d)");
            for (int i = 0; i < n; i++) {
                for (int j = n-i; j >= 1; j--) {
                    System.out.print(j+" ");
                }
                System.out.println("");
            }

        } else {
            System.out.println("Please!! enter positive interger");
        }
    }

}
