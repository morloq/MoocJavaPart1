/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Multiplier {
    
    private int number  = 0;
    
    public Multiplier(int number)
    {
        this.number = number;
    }
    
    public int multiply(int otherNumber)
    {
        int result = 0;
        result = otherNumber * number;
        return result;
    }
}
