/*
Write a Java program to separate even and odd numbers of a given array of integers. Put
all even numbers first, and then odd numbers.
 */
package lab3p9;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3P9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int n = input.nextInt();
        int array[] = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = input.nextInt();
        }

        System.out.print("Original Array ");
        System.out.println(Arrays.toString(array));

        int leftSide = 0, rightSide = array.length - 1;

        while (leftSide < rightSide) {
            while (array[leftSide] % 2 == 0 && leftSide < rightSide) {
                leftSide++;
            }

            while (array[rightSide] % 2 == 1 && leftSide < rightSide) {
                rightSide--;
            }

            if (leftSide < rightSide) {
                int temp = array[leftSide];
                array[leftSide] = array[rightSide];
                array[rightSide] = temp;
                leftSide++;
                rightSide--;
            }
        }

        System.out.print("Array after separation ");
        System.out.println(Arrays.toString(array));
    }
}
