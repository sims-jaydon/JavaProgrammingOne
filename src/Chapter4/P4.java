package Chapter4;

import java.util.Scanner;

/**
 * Program to read two bids from construction companies and compares them to
 * print the winner.
 *
 * @author Jaydon Sims
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String bidder1 = in.next();
        System.out.print("How many hours of work will you require? ");
        double hours1 = in.nextDouble();
        System.out.print("How much do you charge per hour? ");
        double costperhour1 = in.nextDouble();
        System.out.print("Please enter your name: ");
        String bidder2 = in.next();
        System.out.print("How many hours of work will you require? ");
        double hours2 = in.nextDouble();
        System.out.print("How much do you charge per hour? ");
        double costperhour2 = in.nextDouble();
        double cost1 = hours1 * costperhour1;
        double cost2 = hours2 * costperhour2;
        if (cost1 < cost2) {
            System.out.printf("The winner is %s with a total cost of %.2f", bidder1, cost1);
        }
        if (cost2 < cost1) {
            System.out.printf("The winner is %s with a total cost of %.2f", bidder2, cost2);
        }
        if (cost1 == cost2 && hours1 < hours2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %.2f hours", bidder1, cost1, hours1);
        }
        if (cost1 == cost2 && hours1 > hours2) {
            System.out.printf("The winner is %s with a total cost of %.2f and %.2f hours", bidder2, cost2, hours2);
        }
        if (cost1 == cost2 && hours1 == hours2) {
            System.out.printf("Both %s and %s have an equal total cost of %.2f and %.2f hours", bidder1, bidder2, cost1, hours1);
        }
    }
}
