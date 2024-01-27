// Practicum 12a (Yes/No Program) Improved
// ----------------------------------------------------
// This improved version of the program adds the
// handling of invalid input.
// ----------------------------------------------------
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
      // NOTE: If respose not initialzed to the empty string,
      // then will get an error that "response may not have
      // been initialized" on line 41.
      String response = "";
      boolean valid_input = false;
      Scanner input = new Scanner(System.in);

      while(!valid_input) {
        // get input
        System.out.print("Enter (yes/YES) or (no/NO): ");
        response = input.nextLine();

        // check if valid
        if(response.toUpperCase().equals("YES") ||
           response.toUpperCase().equals("NO"))
          valid_input = true;
        else
          System.out.println("** Invalid Input - Please reenter **\n");
      }
      
      // display result
      if(response.toUpperCase().equals("YES"))
        System.out.println("User entered yes");

      if(response.toUpperCase().equals("NO"))
        System.out.println("User entered no");
    }
}
