package Chapter4;

import java.util.Scanner;

/**
 * Program to prompt the user to enter two strings and reports whether the
 * second string is a substring of the first string
 *
 * @author Jaydon Sims
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter two characters: ");
        String status = in.next();
        char major = Character.toUpperCase(status.charAt(0));
        char year = status.charAt(1);
        String courseName = "";
        String yearName = "";
        if (major == 'M' || major == 'I' || major == 'C') {
            if (year != '1' && year != '2' && year != '3' && year != '4') {
                System.out.print("Invalid input");
                System.exit(0);
            }
            switch (major) {
                case 'M':
                    courseName = "Mathmatics";
                    break;
                case 'C':
                    courseName = "Computer Science";
                    break;
                case 'I':
                    courseName = "Information Technology";
                    break;
                default:
                    break;
            }
            switch (year) {
                case '1':
                    yearName = "Freshman";
                    break;
                case '2':
                    yearName = "Sophmore";
                    break;
                case '3':
                    yearName = "Junior";
                    break;
                case '4':
                    yearName = "Senior";
                    break;
                default:
                    break;
            }
            System.out.printf("%s %s%n", courseName, yearName);
        } else {
            System.out.printf("Invalid input.%n");
        }
    }
}
