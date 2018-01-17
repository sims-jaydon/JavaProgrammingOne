package Chapter5;

import java.util.Scanner;

/**
 * Program to allow multiple users to cast a vote and displays the total number
 * of votes at the end.
 *
 * @author Jaydon Sims
 */
public class P5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting: ");
        int Yes = 0;
        int No = 0;
        int Invalid = 0;
        int totalVotes = 0;
        String vote;
        vote = input.next().toUpperCase();
        while (!vote.equals("Q")) {
            switch (vote) {
                case "Y": {
                    ++totalVotes;
                    ++Yes;
                }
                break;
                case "N": {
                    ++totalVotes;
                    ++No;
                }
                break;
                default: {
                    System.out.println("INVALID CODE: Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting:");
                    ++Invalid;
                    ++totalVotes;
                }
                break;
            }
            System.out.println("Enter 'Y' to vote yes, 'N' to vote no, or 'Q' to quit voting");
            vote = input.next().toUpperCase();
        }
        System.out.println("Yes votes: " + Yes);
        System.out.println("No votes: " + No);
        System.out.println("Invalid votes: " + Invalid);
        System.out.println("Total votes: " + totalVotes);
    }
}
