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
public class BirdStuff {
    private final Bird bird;
    private final Map<String,Integer> observations;
    
    public BirdStuff()
    {
        this.bird = new Bird();
        this.observations = new HashMap<String,Integer>();
    }
    public void Add(Scanner reader)
    {
        System.out.print("Name: ");
        String name = reader.nextLine();
        if(name.equals("Turing"))
        {
            System.out.println("Is not a bird!");
        }
        else if(!name.equals("Turing"))
        {
            System.out.print("Latin Name: ");
            String latinName = reader.nextLine();
            observations.put(name, 0);
            bird.addBird(name, latinName);
        }
    }
    
    public void Obervation(Scanner reader)
    {
        System.out.print("What was observed?: ");
        String observed = reader.nextLine();
        if(!observed.equals("Turing"))
        {
            for(String s : observations.keySet())
            {
                if(s.equals(observed))
                {
                    observations.put(s, observations.get(s) +1);//+1 for bird that was spotted
                }
            }
        }
        else
        {
            System.out.println("Is not a bird!");
        }
    }
    public void Statistics()
    {
        for(String bird : bird.getBirds().keySet())
        {
            int timesObserved = this.observations.get(bird);
            System.out.println(bird + " (" + this.bird.getBirds().get(bird) + "):" + timesObserved + " observations" );
        }
    }
    
    public void Show(Scanner reader)
    {
        System.out.print("What? ");
        String showBird = reader.nextLine();
        for(String birdie : this.bird.getBirds().keySet())
        {
            if(birdie.equals(showBird))
            {
                int timesObserved = this.observations.get(birdie);
                System.out.println(birdie + " (" + this.bird.getBirds().get(birdie) + "):" + timesObserved + " observations" );
            }
        }
    }
}