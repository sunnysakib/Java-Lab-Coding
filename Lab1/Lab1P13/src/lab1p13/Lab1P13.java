/*
Write a Java program to compare two numbers. 
Input Data: 
Input first integer: 25 
Input second integer: 39 
Expected Output 
25 != 39 
25 < 39 
25 <= 39
 */
package lab1p13;

import java.util.Scanner;

public class Lab1P13 {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int integer1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int integer2 = input.nextInt();
        
        if(integer1 < integer2){
            System.out.println(integer1+ " != "+integer2);
            System.out.println(integer1+ " < "+integer2);
            System.out.println(integer1+ " <= "+integer2);
        } else if (integer1 == integer2){
            System.out.println(integer2+ " != "+integer1);
            System.out.println(integer2+ " < "+integer1);
            System.out.println(integer2+ " <= "+integer1);
        }
    }
    
}
