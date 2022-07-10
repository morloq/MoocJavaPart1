
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        double n = Integer.parseInt(reader.nextLine());
        double i = 1;
        int result = 1;
        //System.out.println("The result is " + result);
        while (i <= n)
        {
            result += (int)Math.pow(2,i);
            i++;
        }
        System.out.println("The result is " + result);
    }
}
