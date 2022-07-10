
public class NumberStatistics {
    private int amountOfNumbers;
    private int sum;
    
    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers
        this.amountOfNumbers = 0;
    }

    public void addNumber(int number) {
        // code here
        this.amountOfNumbers += 1;
        this.sum += number;
    }

    public int amountOfNumbers() {
        // code here
        return this.amountOfNumbers;
    }
    
    public int sum()
    {
        return sum;
    }
    
    public double average()
    {
        double average = 0;
        if(this.amountOfNumbers > 0)
        {
            average = (double)this.sum()/this.amountOfNumbers();
        }
        //return (double)this.sum()/this.amountOfNumbers();
        return average;
    }
}
