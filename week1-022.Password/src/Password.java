
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot"; // Use carrot as password when running tests.
        String pw = "";
        while(!(pw.equals("carrot")))
        {
            System.out.println("Type the password: ");
            pw = reader.nextLine();
            if (pw.equals("carrot"))
            {
                System.out.println("Right!");
                System.out.println();
                System.out.println("The secret is: jryy qbar!");
            }
            else
                System.out.println("Wrong!");
        }
        // Write your code here
    }
}
