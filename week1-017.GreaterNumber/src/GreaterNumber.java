import java.util.Scanner;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first number: ");
        int one = Integer.parseInt(reader.nextLine());
        System.out.println("Type the second number: ");
        int two = Integer.parseInt(reader.nextLine());
        if (one > two)
        {
            System.out.println("Greater number: " + one);
        }
        else if(one < two)
        {
            System.out.println("Greater number: " + two);
        }
        else
            System.out.println("The numbers are equal!");
    }
}
