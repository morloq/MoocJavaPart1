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
public class Bird {

    private Map<String,String> birds;
    
    public Bird()
    {
        this.birds = new HashMap<String,String>();
    }
    
    public void addBird(String name, String latinName)
    {
        if(!name.equals("Turing"))
        {
            this.birds.put(name, latinName);
        }
        else
            System.out.println("Is not a bird!");
    }
    
    public Map<String,String> getBirds()
    {
        return this.birds;
    }
}