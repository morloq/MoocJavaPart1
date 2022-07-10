import java.util.Collections;
import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
        int greatest = Collections.max(list);
        return greatest;
    }
        /* public int getMax(ArrayList list){
    int max = Integer.MIN_VALUE;
    for(int i=0; i<list.size(); i++){
        if(list.get(i) > max){
            max = list.get(i);
        }
    }
    return max;
}*/
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}
