import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        System.out.println("Length of the end part: ");
        int length = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + endpart(word, length));
    }
    
    public static String endpart(String text, int n)
    {
        String endpart = text.substring(text.length()-n);
        return endpart;
    }
}
