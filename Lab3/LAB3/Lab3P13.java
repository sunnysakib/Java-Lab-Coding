/*
Write a java program using while loop to print Pascal's triangle
Input: 6
Expected Output:
        1
       1 1
      1 2 1
     1 3 3 1
    1 4 6 4 1
   1 5 10 10 5 1
 */
package lab3p13;

import java.util.Scanner;

public class Lab3P13 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = input.nextInt();
        int c = 0;
        int i = 0;

        while (i < n) {

            int j = 1;
            while (j <= n - i) {
                System.out.print(" ");
                j++;
            }

            int k = 0;
            while (k <= i) {
                if (k == 0 || i == 0) {
                    c = 1;
                } else {
                    c = c * (i - k + 1) / k;
                }
                System.out.print(" " + c);
                k++;
            }

            System.out.println("");
            i++;
        }

    }

}
