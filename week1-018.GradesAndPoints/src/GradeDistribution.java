/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
public class GradeDistribution {
    
    public ArrayList<Integer>distribution(ArrayList<Integer> grades)
    {
        ArrayList<Integer> distribution = new ArrayList<Integer>();
        for(int x : grades)
        {
            if (x >= 0 && x <= 29)
        {
            distribution.add(0);//failed
        }
        else if(x >=30 && x <= 34)
        {
            distribution.add(1);//grade 1
        }
        else if(x >= 35 && x <= 39)
        {
            distribution.add(2);//grade 2
        }
        else if(x >= 40 && x <= 44)
        {
            distribution.add(3);//grade 3
        }
        else if(x >= 45 && x <= 49)
        {
            distribution.add(4);//grade 4
        }
        else
            distribution.add(5);//grade 5
        }
        return distribution;
    }
}
