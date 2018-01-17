package Chapter6;

import java.util.Scanner;

/**
 * Program to allow the user to enter a password and display whether or not it
 * is secure
 *
 * @author Jaydon Sims
 */
public class C6_18 {

    
    public static final int PASSWORD_REQUIRED_LENGTH = 8;
/**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String s = input.nextLine();
        if (isValidPassword(s)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("A password must have at least eight characters");
            System.out.println("A password must consist of only letters and digits");
            System.out.println("A password must contain at least two digits");
            System.out.println("Invalid Password");
        }
    }
    /**
     *
     * @param password
     * @return the valid password
     */
    public static boolean isValidPassword(String password) {
        if (password.length() < PASSWORD_REQUIRED_LENGTH) {
            return false;
        }
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (isLetter(ch)) {
                charCount++;
            } else if (isNumeric(ch)) {
                numCount++;
            } else {
                return false;
            }
        }
        return (charCount >= 2 && numCount >= 2);
    }

    public static boolean isLetter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }

    public static boolean isNumeric(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
