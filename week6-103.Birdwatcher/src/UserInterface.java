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
public class UserInterface {
    
    private final BirdStuff birds;
    
    public UserInterface()
    {
        this.birds = new BirdStuff();
    }
    public void start(Scanner reader)
    {
        while(true)
        {
           System.out.print("? ");
           String command = reader.nextLine();
           if(command.equals("Add"))
           {
               birds.Add(reader);
           }
           if(command.equals("Observation"))
           {
               birds.Obervation(reader);
           }
           if(command.equals("Statistics"))
           {
               birds.Statistics();
           }
           if(command.equals("Quit"))
           {
               break;
           }
           if(command.equals("Show"))
           {
               birds.Show(reader);
           }
        }
    }
}