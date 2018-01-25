package Chapter7;

import java.util.Scanner;

/**
 * Program to allow the user to enter two lists and compare them.
 *
 * @author Jaydon Sims
 */
public class C7_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter list 1: ");
        int[] arrayList1 = new int[input.nextInt()];
        filllist(arrayList1);

        System.out.print("Enter list 2: ");
        int[] arrayList2 = new int[input.nextInt()];
        filllist(arrayList2);

        if (equals(arrayList1, arrayList2)) {
            System.out.print("Two lists are strictly identical");
        } else {
            System.out.print("Both list are not strictly identical");
        }

    }

    /**
     * Method to calculate the array
     *
     * @param arrayList holds the array
     */
    public static void filllist(int[] arrayList) {
        for (int i = 0; i < arrayList.length; i++) {
            arrayList[i] = input.nextInt();
        }
    }

    /**
     * Method to assist comparing the strings
     *
     * @param list1 holds the first list
     * @param list2 holds the list that's compared to the other
     * @return true or false
     */
    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i]) {
                return false;
            }
        }
        return true;
    }

}
