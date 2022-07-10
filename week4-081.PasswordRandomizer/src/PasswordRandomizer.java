import java.util.Random;
import java.nio.*;
import java.nio.charset.Charset;

public class PasswordRandomizer {
    // Define the variables
    private Random random;
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.random = new Random();
        this.length = length;
        
    }

    public String createPassword() {
        // write code that returns a randomized password
        
        int leftLimit = 97; //a
        int rightLimit = 122; //z
        StringBuilder buffer = new StringBuilder(this.length);
        for (int i = 0; i < this.length; i++)
        {
            int randomlimited = leftLimit + (int)(random.nextFloat() * (rightLimit - leftLimit +1));
            buffer.append((char) randomlimited);
        }
        String password = buffer.toString();
        return password;
    }
}
