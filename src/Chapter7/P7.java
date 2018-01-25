package Chapter7;

import java.util.Scanner;
import java.util.Arrays;

/**
 * Program to allow the user to enter numbers and displays the array
 *
 * @author Jaydon Sims
 */
public class P7 {

    /**
     * Main method
     *
     * @param args reads from the keyboard
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers;
        System.out.println("How many numbers will be read: ");
        int arraysize = input.nextInt();
        numbers = new double[arraysize];
        input(numbers, arraysize);
        System.out.println("The average is " + average(numbers, arraysize));
        System.out.println("The contents of the array: " + Arrays.toString(numbers));
    }

    /**
     * Method to retrieve the array size
     *
     * @param array holds the array
     * @param arraysize holds the array size
     */
    public static void input(double[] array, int arraysize) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + arraysize + " elements: ");
        for (int i = 0; i < arraysize; i++) {
            array[i] = input.nextDouble();
        }
        average(array, arraysize);
    }

    /**
     * Method to calculate the average
     *
     * @param array hold the array
     * @param arraysize holds the array size
     * @return the average
     */
    public static double average(double[] array, int arraysize) {
        double average = 0;
        for (int i = 0; i < arraysize; i++) {
            average += array[i];
        }
        average = (average / arraysize);
        return average;
    }
}
