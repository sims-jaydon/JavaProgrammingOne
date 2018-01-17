package Chapter3;

import java.util.Scanner;

/**
 * Program to let the user guess a coin result in heads or tails, then randomly
 * generates a result and informs the user if the guess was right or wrong
 *
 * @author Jaydon Sims
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int coin = (int) (Math.random() * 2);
        System.out.print("Enter 0 for Heads or 1 for Tails ");
        int guess = input.nextInt();
        if (guess == coin) {
            System.out.println("The coin is " + coin + " Congratulations!");
        } else {
            System.out.println("The coin is " + coin + " Try again!");
        }
    }
}
