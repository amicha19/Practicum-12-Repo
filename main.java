// Practicum 12 (Yes/No Program)
// (TO WRITE)

// This program should prompt the user to enter "yes" or
// "no" and output their response. The user should be allowed to
// enter their response with either upper or lower case characters
// (e.g., "yes", "Yes", "YES").

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// "User entered yes"
// "User entered no"
//
// (TO COMPLETE)
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // prompt user to enter "yes" or "no"
        System.out.print("Enter 'yes' or 'no': ");
        String userInput = scanner.next().toLowerCase(); // Convert input to lowercase

        // close the scanner to avoid resource leaks
        scanner.close();

        // output based on user input
        if (userInput.equals("yes")) {
            System.out.println("User entered yes");
        } else if (userInput.equals("no")) {
            System.out.println("User entered no");
        } else {
            System.out.println("Invalid input. Please enter 'yes' or 'no'.");
        }
    }
}
