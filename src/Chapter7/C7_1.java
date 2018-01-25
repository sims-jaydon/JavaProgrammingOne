package Chapter7;

import java.util.Scanner;

/**
 * Program to take student grades and return them in an array
 *
 * @author Jaydon Sims
 */
public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter total number of Students:");
        int n = input.nextInt();
        System.out.println("Enter " + n + " Scores:");

// Create an Array of n elements
        int[] studentScoreArray = new int[n];

// input the grade in the Array table
        for (int i = 0; i < studentScoreArray.length; i++) {
            studentScoreArray[i] = input.nextInt();
        }

// Display each student indexes , his score and grade.
        for (int i = 0; i < studentScoreArray.length; i++) {
            System.out.println("Student " + i + " Score is " + studentScoreArray[i] + " and grade is " + getStudentGrade(studentScoreArray, i));
        }
    }

    /**
     * Method to get the best score
     *
     * @param studentScoreArray holds the student score in an array
     * @return the best score
     */
    public static int getBestScore(int[] studentScoreArray) {

        int bestScore = studentScoreArray[0];
        for (int i = 0; i < studentScoreArray.length; i++) {
            if (studentScoreArray[i] > bestScore) {
                bestScore = studentScoreArray[i];
            }
        }
        return bestScore;
    }

    /**
     * Method to get the students grade
     *
     * @param studentScoreArray holds student score return student grade
     */
//studentScoreArray
//studentIndex
    public static char getStudentGrade(int[] studentScoreArray, int studentIndex) {
        char n;
        if (studentScoreArray[studentIndex] >= getBestScore(studentScoreArray) - 10) {
            n = 'A';
        } else if (studentScoreArray[studentIndex] >= getBestScore(studentScoreArray) - 20) {
            n = 'B';
        } else if (studentScoreArray[studentIndex] >= getBestScore(studentScoreArray) - 30) {
            n = 'C';
        } else if (studentScoreArray[studentIndex] >= getBestScore(studentScoreArray) - 40) {
            n = 'D';
        } else {
            n = 'F';
        }
        return n;
    }
}
