import java.util.*;
public class Main {  

    public static void main(String[] args) {
    // implement your program here
    // do not put all to one method/class but rather design a proper structure to your program
       Scanner reader = new Scanner(System.in);
       UserInterface ui = new UserInterface();
       ui.start(reader);
    // Your program should use only one Scanner object, i.e., it is allowed to call 
    // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
            
    }
}