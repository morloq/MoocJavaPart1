
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int counter = 1;
        for(int i = 0; i < name.length(); i++)
        {
            System.out.println(counter + ". character: " + name.charAt(i));
            counter++;
        }
    }
    
    
}
