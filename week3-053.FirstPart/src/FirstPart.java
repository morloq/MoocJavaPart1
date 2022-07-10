
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the first word: ");
        int length = Integer.parseInt(reader.nextLine());
        
        System.out.println("Result: " + firstpart(word, length));
        
    }
    
    public static String firstpart(String text, int n)
    {
        String firstpart = text.substring(0, n);
        return firstpart;
    }
    
}
