import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random;

    public LotteryNumbers() {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;//returns arraylist numbers
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.random = new Random();
        this.numbers = new ArrayList<Integer>(7);
        while(this.numbers.size() < 7)//as max. size is supposed to be 7, list will grow with each added element.
            //why did for(int i = 0; i < this.numbers.size(); i++) not work when numbers was created with size 7?
            // list has size 7 but contains 0 elements, therefore it is considered to be empty as it has no elements and the actual size used in the for loop is considered to be 0?
        {
            int randomNumber = this.random.nextInt((39 +1) - 1) + 1;// random number between 1 and 39
            if(!(containsNumber(randomNumber)))
            {
                this.numbers.add(randomNumber);
            }
        }
        // Write the number drawing here using the method containsNumber()
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        return this.numbers.contains(number);
    }
}
