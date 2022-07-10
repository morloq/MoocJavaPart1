/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class LyyraCard {
    
    private double balanceAtStart;
    
    
    public LyyraCard(double balanceAtStart)
    {
        this.balanceAtStart = balanceAtStart;
    }
    public String toString()
    {
        return "The card has " + this.balanceAtStart + " euros";
    }
    public void payEconomical()
    {
        if(!(this.balanceAtStart - 2.50 < 0))
        {
            this.balanceAtStart -= 2.50;
        }
    }
    public void payGourmet()
    {
        if(!(this.balanceAtStart - 4.00 < 0))
        {
            this.balanceAtStart -= 4.00;
        }
    }
    public void loadMoney(double amount)
    {
        if(this.balanceAtStart + amount <= 150.0 && amount >= 0)
        {
            this.balanceAtStart += amount;
        }
        else if(this.balanceAtStart + amount > 150 && amount >= 0)
        {
            this.balanceAtStart = 150.0;
        }
    }
}
