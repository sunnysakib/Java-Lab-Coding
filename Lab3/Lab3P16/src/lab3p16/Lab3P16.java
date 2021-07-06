/*
Write a Java program to display the number rhombus structure.
Test Data
Input the number: 7
Expected Output:
           1
          212
         32123
        4321234
       543212345
      65432123456
     7654321234567
      65432123456
       543212345
        4321234
         32123
          212
           1
 */
package lab3p16;

import java.util.Scanner;

public class Lab3P16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();

        int numSpace = 1;
        int start = 0;
        int count = 1;
        for (int i = 1; i <= num * 2; i++) {
            for (int j = num - numSpace; j > 0; j--) {
                System.out.print(" ");
            }
            if (i < num) {
                start = i;
                numSpace++;
            } else {
                start = num * 2 - i;
                numSpace--;
            }
            for (int k = 1; k <= count; k++) {
                System.out.print(start);
                if (k < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < num) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }

}
