package Chapter8;

import java.util.*;

/**
 * Program to allow multiple users to keep track of sales.
 *
 * @author Jaydon Sims
 */
public class P8 {

    /**
     *
     * @param args read input from the keyboard
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = 0;
        int c = 0;
        double[][] money = new double[4][5];

        String salesman, week, answer;
        do {
            do {
                System.out.println("Enter the salesman ID as A, B, C, or D: ");
                salesman = input.next().toUpperCase();
            } while (!salesman.equals("A") && !salesman.equals("B") && !salesman.equals("C") && !salesman.equals("D"));

            switch (salesman) {
                case "A":
                    r = 0;
                    break;
                case "B":
                    r = 1;
                    break;
                case "C":
                    r = 2;
                    break;
                case "D":
                    r = 3;
                    break;
            }
            do {
                System.out.println("Enter the day as M, T, W, H, or F: ");
                week = input.next().toUpperCase();
            } while (!week.equals("M") && !week.equals("T") && !week.equals("W") && !week.equals("H") && !week.equals("F"));

            switch (week) {
                case "M":
                    c = 0;
                    break;
                case "T":
                    c = 1;
                    break;
                case "W":
                    c = 2;
                    break;
                case "H":
                    c = 3;
                    break;
                case "F":
                    c = 4;
                    break;
            }
            System.out.println("Enter the amount of the sale for " + salesman + " on " + week);
            money[r][c] += input.nextDouble();
            do {
                System.out.println("More data? Enter Y for more or N to stop. ");
                answer = input.next().toUpperCase();
            } while (!answer.equals("Y") && !answer.equals("N"));
        } while (!answer.equals("N"));

        for (int x = 0; x < money.length; x++) {
            System.out.print("Salesman " + x);
            for (int y = 0; y < money[x].length; y++) {
                System.out.print("\t" + money[x][y]);
            }
            System.out.println();
        }

    }
}
