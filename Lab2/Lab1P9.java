/*
Write a Java program to print the area and perimeter of a circle. 
Test Data: 
Radius = 7.5 
Expected Output 
Perimeter is = 47.12388980384689 
Area is = 176.71458676442586
 */
package lab1p9;

import java.util.Scanner;

public class Lab1P9 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        float redius = input.nextFloat();
        float perimeter = (float)(2*3.1416*redius);
        float area = (float)(3.1416*redius*redius);
        
        System.out.println("Perimeter is = "+ perimeter);
        System.out.println("Area is = "+ area);
    }

}
