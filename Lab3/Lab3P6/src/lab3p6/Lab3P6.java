/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p6;

import java.util.Random;
import java.util.Scanner;

public class Lab3P6 {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        Random rand = new Random();
        int num = rand.nextInt(100) + 1;
        int guess = 0;
        int count = 0;
        int guesses = 0;

        do
        {
            System.out.println("Guess what number I have (1-100)? ");
            guess = kb.nextInt();
            guesses ++;

            if(num > guess) {
                System.out.println("Too high, try again.");
            } else if(num < guess) {
                System.out.println("Too low, try again.");
            } else {
                System.out.println("You're right, the number is" + num);
                System.out.println("You guessed" + guesses + "times");
            }
        }
        while(guess!=num);
    }
    
}
