package ex_10_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab070_While_GuessingGame {
    public static void main(String[] args) {
        //Guess a number between 1 to 100
        //n = 50
        //g = 80
        // step1 - figure out input and output
        //step2 - write rough logic
        //step3 - write proper logic
        //step4 -optimize
        // step5 - error edge cases

        Random random = new Random();
        int numberToGuess = random.nextInt(100)+1;
        //System.out.println(numberToGuess);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int guess;
        int attempts = 0;

        while(true)
        {
            guess = scanner.nextInt();
            attempts++;

            if (guess < numberToGuess)
            {
                System.out.println("Too Low, try again");
            }
            else if (guess > numberToGuess)
            {
                System.out.println("Too High , try again");
            }
            else
            {
                System.out.println("Correct! You guessed it in " + attempts + " attempt");
                break;
            }
        }
    }
}