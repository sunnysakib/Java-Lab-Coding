/*
Write a Java program to print the area and perimeter of a rectangle. 
Test Data: 
Width = 5.6 Height = 8.5 
Expected Output 
Area is 5.6 * 8.5 = 47.60 
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
package lab1p11;

import java.util.Scanner;

public class Lab1P11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Width: ");
        float width = input.nextFloat();
        System.out.print("Enter Height: ");
        float height = input.nextFloat();

        float area = (float) width * height;
        float perimeter = (float) (2.0 * (width + height));

        System.out.println("Area is " + width + " * " + height + " = " + area);
        System.out.println("Perimeter is 2" + " * " + (width + " + " + height) + " = " + perimeter);
    }

}
