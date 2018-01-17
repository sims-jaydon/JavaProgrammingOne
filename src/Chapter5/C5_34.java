package Chapter5;

import java.util.Scanner;

/**
 * Program to have the user enter rock, paper, or scissor and play with them.
 *
 * @author Jaydon Sims
 */
public class C5_34 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computerGuess, playerGuess;
        int compCount = 0, playerCount = 0;
        do {
            System.out.print("Enter scissor (0), rock (1), or paper (2): ");
            playerGuess = input.nextInt();
            computerGuess = (int) (Math.random() * 3);
            switch (playerGuess) {
                case 0:
                    if (computerGuess == 0) {
                        System.out.println("The computer is " + computerGuess + " You are " + playerGuess + " It's a draw");
                    }
                    if (computerGuess == 1) {
                        compCount++;
                        System.out.println("The computer is " + computerGuess + " You are " + playerGuess + " You lost");
                    }
                    if (computerGuess == 2) {
                        playerCount++;
                        System.out.println("The computer is " + computerGuess + " You are " + playerGuess + " You win");
                    }
                    break;
                case 1:
                    if (computerGuess == 0) {
                        System.out.println("The computer is " + computerGuess + " You are " + playerGuess + " It's a draw");
                    }
                    if (computerGuess == 1) {
                        compCount++;
                        System.out.println("The computer is " + computerGuess + " You are " + playerGuess + " You lost");
                    }
                    if (computerGuess == 2) {
                        playerCount++;
                        System.out.println("The computer is " + computerGuess + " You are " + playerGuess + " You win");
                    }
                    break;
                case 2:
                    if (computerGuess == 0) {
                        System.out.println("The computer is " + computerGuess + " You are " + playerGuess + " It's a draw");
                    }
                    if (computerGuess == 1) {
                        compCount++;
                        System.out.println("The computer is " + computerGuess + " You are " + playerGuess + " You lost");
                    }
                    if (computerGuess == 2) {
                        playerCount++;
                        System.out.println("The computer is " + computerGuess + " You are " + playerGuess + " You win");
                    }
                    break;
            }
        } while (playerCount <= 2 && compCount <= 2);
        if (playerCount < compCount) {
            System.out.println("The computer won more than two times");
        }
        if (compCount < playerCount) {
            System.out.println("You won more than two times");
        }
    }
}
