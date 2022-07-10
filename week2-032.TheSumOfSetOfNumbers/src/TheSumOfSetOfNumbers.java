
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what?");
        int n = Integer.parseInt(reader.nextLine());
        int i = 0;
        int x = 1;
        int sum = 0;
        while (i <= n)
        {
            System.out.println(sum);
            sum = sum + x;
            x++;
            i++;
        }
    }
}