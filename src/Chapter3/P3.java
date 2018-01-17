package Chapter3;

import java.util.Scanner;

/**
 * Program to let the user enter two numbers and informs the user if the first
 * number less, greater than, or equal to. If it cannot be divided by 0, and if
 * it is a proper or improper fraction.
 *
 * @author Jaydon Sims
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter enter umber 1: ");
        double number1 = input.nextDouble();
        System.out.print("Enter number 2: ");
        double number2 = input.nextDouble();
        if (number1 < number2) {
            System.out.println("The first number is less than the second.");
        }
        if (number1 > number2) {
            System.out.println("The first number is greater than the second.");
        }
        if (number1 == number2) {
            System.out.println("The first number is equal to the second.");
        }
        if (number1 <= number2) {
            System.out.println("The first number is less than or equal to the second.");
        }
        if (number1 != number2) {
            System.out.println("The first number is not equal to the second.");
        }
        if (number2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else if (number1 / number2 < 1) {
            System.out.println("proper fraction.");
        } else if (number1 / number1 > 1) {
            System.out.println("improper fraction");
        }
        if (number1 >= 90) {
            System.out.println("A");
        } else if (number1 >= 80) {
            System.out.println("B");
        } else if (number1 >= 70) {
            System.out.println("C");
        } else if (number1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if (number2 >= 1 && number2 <= 100) {
            System.out.println("In range.");
        } else {
            System.out.println("Out of range.");
        }
    }
}
