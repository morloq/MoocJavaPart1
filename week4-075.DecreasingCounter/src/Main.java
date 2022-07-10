public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(2);

        
        counter.reset(); 
        counter.setInitial(); 
        counter.printValue();
    }
}
