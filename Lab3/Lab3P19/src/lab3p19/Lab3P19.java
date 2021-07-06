/*
Write a program to compute sinx for given x. The user should supply x and a positive
integer n. We compute the sine of x using the series and the computation should use all
terms in the series up through the term involving xn
sin x = x - x
3
/3! + x5
/5! - x
7
/7! + x9
/9! .......
 */
package lab3p19;

import java.util.Scanner;

public class Lab3P19 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        float x = input.nextInt();
        System.out.println("Enter the value of n: ");
        int n = input.nextInt();
        
        int fact;
        float sum = 0;
        int sign = -1;
        for (int i = 1; i <= n; i = i + 2) {
            float p = 1;
            fact = 1;
            for (int j = 1; j <= i; j++) {
                p = p * x;
                fact = fact * j;
            }
            sign = -1 * sign;
            sum += sign * p / fact;

        }
        System.out.println(" sin" + x + " " + sum);
    }

}
