
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int last = Integer.parseInt(reader.nextLine());
        int x = first;
        while (x <= last)
        {
            if(!(x > last))
            {
                System.out.println(x);
                x++;
            }
        }
        // write your code here

    }
}
