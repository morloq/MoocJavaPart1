import java.util.*;
public class Main {
    public static void main(String[] args) {
        // write testcode here
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }
    public static int smallest(int[] array)
    {
        int smallest = 100000000;
        for(int i = 1; i < array.length-1; i++)
        {
           if(array[i] <= smallest)
           {
               smallest = array[i];
           }
        }
        //smallest = array[array.length-1];
        return smallest;
    }
    public static int indexOfTheSmallest(int[] array)
    {
        int smallest = smallest(array);
        int position = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(array[i] == smallest)
            {
                return position = i;
                //position = i;
            }
        }
        //smallest = array[array.length-1];
        return position;
    }
    public static int indexOfTheSmallestStartingFrom(int[] array, int index)
    {
        int smallest = 100000000;
        for(int i = index; i <= array.length-1; i++)
        {
           if(array[i] < smallest)
           {
               smallest = array[i];
           }
        }//smallest = smallest element starting from index
        
        int position = 0;
        for(int i = index; i < array.length; i++)
        {
            if(array[i] == smallest)
            {
                position = i;
                //position = i;
            }
            
        }
        
        //smallest = array[array.length-1];
        return position;
    }
    public static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    public static void sort(int[] array)
    {
        System.out.println(Arrays.toString(array));
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[i] >= array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                    System.out.println(Arrays.toString(array));
                }
            }
        }
    }
}