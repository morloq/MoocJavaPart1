
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name:");
        String name = reader.nextLine();
        System.out.println("Number of the characters: " + calculateCharacters(name));
        // call your method from here
    }
    
    // do here the method
    public static int calculateCharacters(String text)
    {
        int length = text.length();
        return length;
    }
}
