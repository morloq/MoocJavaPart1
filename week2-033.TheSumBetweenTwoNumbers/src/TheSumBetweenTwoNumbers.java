
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        int x = first + 1;
        int i = first;
        int sum = first;
        while (i < last)
        {
            System.out.println(sum);
            sum = sum + x;
            x++;
            i++;
        }
        System.out.println("The sum is " + sum);
    }
}
