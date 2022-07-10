import java.util.Scanner;

public class FirstCharacters {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        int counter = 1;
        if(!(name.length() < 3))
        {
            for(int i = 0; i < 3; i++)
            {
                System.out.println(counter + ". character: " + name.charAt(i));
                counter++;
            }
        }
    }
}
