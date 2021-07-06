/*
Write a Java program to print the odd numbers from 1 to 99. Prints one number per line.
Sample Output:
1 
3 
5 
.... 
97 
99
 */
package lab1p15;

public class Lab1P15 {

    public static void main(String[] args) {

        System.out.println("The odd numbers from 1 to 99: ");
        for (int i = 1; i < 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

    }

}
