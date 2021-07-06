/*
Write a Java program that takes a number as input and prints its 
multiplication table upto 10. 
Test Data: 
Input a number: 8 
Expected Output: 
8 x 1 = 8 
8 x 2 = 16 
8 x 3 = 24 
8 x 10 = 80
 */
package lab1p7;

import java.util.Scanner;

public class Lab1P7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        
        for(int i=1; i<=10; i++){
            System.out.println(num + " x " + i + " = " + num*i);
        }
    }
    
}
