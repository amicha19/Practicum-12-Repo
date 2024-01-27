// Practicum 12 (Prompt for Yes/No Program) Solution

// This program should prompt the user to enter "yes" or
// "no" and output their response. The user should be allowed to
// enter their response with either upper or lower case characters
// (e.g., "yes", "Yes", "YES").

// REQUIRED OUTPUT:
// The program MUST display the results exactly as shown below:
// "User entered yes"
// "User entered no"
//
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      // init
      String response;
      Scanner input = new Scanner(System.in);

      // get input
      System.out.print("Enter (yes/YES) or (no/NO): ");
      response = input.nextLine();

      // display result
      if(response.toUpperCase().equals("YES"))
        System.out.println("User entered yes");

      if(response.toUpperCase().equals("NO"))
        System.out.println("User entered no");
    }

}
