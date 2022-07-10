/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Counter {
    private int number;
    private boolean check;
    
    public Counter(int startingValue, boolean check)
    {
        this.number = startingValue;
        //check is on if given value to check was true??? what?
        
        this.check = check;
    }
    public Counter(int startingValue)
    {
        this.number = startingValue;
        //check on new counter should be off??
        //this.check = false;
    }
    public Counter(boolean check)
    {
        this.number = 0;
        if(number >= 0)
        {
            check = true;
        }
        this.check = check;
        //check is on if the parameter given to check was true??
    }
    public Counter()
    {
        this.number = 0;
        //checking off??
        //this.check = false;
    }
    public int value()
    {
        return this.number;
    }
    public void increase()
    {
        increase(1);
    }
    public void decrease()
    {
        decrease(1);
    } 
    //84.2
    public void increase(int increaseAmount)
    {
        if(increaseAmount > 0)
            this.number += increaseAmount;
    }
    public void decrease(int decreaseAmount)
    {
            if(decreaseAmount >= 0)
            {
                this.number -= decreaseAmount;
            }
            if((this.number < 0) && (check))// if check is on and number is already less than 0, set it
                //back to 0 as number is not supposed to turn negative
            {
                this.number = 0;
            }
    }
}
