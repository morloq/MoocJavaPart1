/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.*;
public class SortArray {
    private int[] array;
    
    public SortArray(int[] array)
    {
        this.array = array;
    }
    
    public int[] arraySort(int[] array)
    {
        
        for(int i = 0; i < array.length; i++)
        {
            for(int j = i +1; j < array.length; i++)
            {
                if(array[i] > array[j])
                {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}