
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        char[] c = text.toCharArray();
        for(int i = 0; i< c.length/2; i++)
        {
            char temp = c[i];
            c[i] = c[c.length -i -1];
            c[c.length -i -1] = temp;//why does this not work??? because temp has to be char!!!!
        }
        //text = c.toString();//returns only the reference of the array.
        //new StringBuffer(text).reverse().toString();// did not work.
        text = new String (c);
        return text;//short form: return new String (c);
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
