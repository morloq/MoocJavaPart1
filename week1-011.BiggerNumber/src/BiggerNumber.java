
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int one = Integer.parseInt(reader.nextLine());
        System.out.println("Type another number: ");
        int two = Integer.parseInt(reader.nextLine());
        
        System.out.println("The bigger number of the two numbers given was: "
        + Math.max(one, two));

        // Implement your program here. Remember to ask the input from user
    }
}
