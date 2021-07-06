/*
Create a function that takes an integer n and reverses it.
Examples
rev(5121) ➞ "1215"
rev(69) ➞ "96"
rev(-122157) ➞ "751221"
Notes
This challenge is about using two operators that are related to division.
If the number is negative, treat it like it's positive.
 */
package lab1p16;

import java.util.Scanner;

public class Lab1P16 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        int newNum = 0;
        if (num < 0) {
            newNum = (-1) * num;
        } else {
            newNum = num;
        }
        for (int i = 10; newNum > 10;) {
            int r = newNum % i;
            System.out.print(r);
            newNum = newNum / i;

        }
        System.out.println(newNum);
    }

}
