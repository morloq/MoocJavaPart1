import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int factorial = Integer.parseInt(reader.nextLine());
        int x = 1;
        int i = 1;
        int result = 1;
        while (x <= factorial)
        {
            if (factorial == 0 || factorial == 1)
            {
                System.out.println("Factorial is  1");
            }
            result = result * i;
            x++;
            i++;
            
        }
        System.out.println("Factorial is " + result);
        
    }
}
