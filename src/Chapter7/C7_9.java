package Chapter7;

import java.util.Scanner;

/**
 * Program to allow the user to enter 10 numbers and display the smallest
 * element.
 *
 * @author Jaydon Sims
 */
public class C7_9 {

    /**
     *
     * @param args reads from the keyboard
     */
    public static void main(String[] args) {
        double[] minimumElementArray = new double[10];

        insertNumbers(minimumElementArray);
        System.out.print("Smallest element: " + min(minimumElementArray));
    }

    /**
     *
     * @param minimumElementArray holds minimum element
     */
    public static void insertNumbers(double[] minimumElementArray) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");

        for (int i = 0; i < 10; i++) {
            minimumElementArray[i] = input.nextDouble();
        }
        input.close();
    }

    /**
     *
     * @param array holds the array
     * @return the smallest element
     */
    public static double min(double[] array) {
        double smallestElement = array[0];
        for (int i = 1; i < 10; i++) {
            if (smallestElement > array[i]) {
                smallestElement = array[i];
            }
        }

        return smallestElement;

    }
}
