
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            sum += list.get(i);
        }
        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        double average = sum(list) / (double) list.size();
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double n = 0;
        double av = average(list);//to only have to call it once, as is specified
        for (int i = 0; i < list.size(); i++) {
            n += (double) Math.pow((list.get(i) - av), 2);
        }
        n /= (list.size() - 1);
        return n;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
