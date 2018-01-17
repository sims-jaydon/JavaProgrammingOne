package Chapter3;

import java.util.Scanner;

/**
 * Program to prompt the user to enter an integer and determines whether it is
 * divisible by 5 and 6, 5 or 6, and 5 or 6 but not both
 *
 * @author Jaydon Sims
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 and 6? true");
        } else {
            System.out.println("Is " + number + " divisible by 5 and 6? false");
        }
        if (number % 5 == 0 || number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 or 6? true");
        } else {
            System.out.println("Is " + number + " divisible by 5 or 6? false");
        }
        if (number % 5 == 0 ^ number % 6 == 0) {
            System.out.println("Is " + number + " divisible by 5 or 6, but not both? true");
        } else {
            System.out.println("Is " + number + " divisible by 5 and 6, but not both? false");
        }
    }
}
