/*
Write a program called CheckOddEven which prints "Odd Number" if the int variable
“number” is odd, or “Even Number” otherwise. The program shall always print “bye!”
before exiting.
 */
package lab3p1;

import java.util.Scanner;

public class Lab3P1 {

    public static int CheckOddEven(int num){
        if(num%2==0){
            return 1;
        } else{
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = input.nextInt();
        
        int result = CheckOddEven(num);
        
        if(result == 1){
            System.out.println(num+" is Even");
        } else{
            System.out.println(num+" is odd");
        }
        System.out.println("Bye!");
    }
    
}
