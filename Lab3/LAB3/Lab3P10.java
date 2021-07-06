/*
Write a program to print following using while loop:
i)                       ii)                             
      1
     222
    33333
   4444444
  555555555
ii)
      1
     212
    32123
   4321234
  543212345
 */
package lab3p10;

import java.util.Scanner;

public class Lab3P10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int n = input.nextInt();

        {
            System.out.println("Example (i)");
            int i = 1;
            while (i <= n) {
                int j = 0;
                while (j <= n - i) {
                    System.out.print(" ");
                    j++;
                }
                int k = 1;
                while (k < i * 2) {
                    System.out.print(i);
                    k++;
                }
                System.out.println();
                i++;
            }
        }

        {
            System.out.println("");
            System.out.println("Example (ii)");
            int i = 0;
            while (i <= n) {
                int j = 0;
                while (j <= n - i) {
                    System.out.print(" ");
                    j++;
                }
                int k = i;
                while (k > 1) {
                    System.out.print(k);
                    k--;
                }
                int z = 1;
                while (z <= i) {
                    System.out.print(z);
                    z++;
                }
                System.out.println();
                i++;
            }
        }
    }

}
