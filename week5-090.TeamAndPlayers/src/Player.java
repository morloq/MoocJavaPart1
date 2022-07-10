/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Player {
    private String name;
    private int amountOfGoals;
    
    public Player(String name, int amountOfGoals)
    {
        this.name = name;
        this.amountOfGoals = amountOfGoals;
    }
    
    public Player(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int goals()
    {
        return this.amountOfGoals;
    }
    
    public String toString()
    {
        return this.name + ", goals " + Integer.valueOf(this.amountOfGoals);
    }
}
