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

public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize = 16;
    
    public Team(String name)
    {
        this.name = name;
        this.players = new ArrayList<Player>();
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public void addPlayer(Player player)
    {
        if(players.size() < maxSize)
        {
            this.players.add(player);
        }
    }
    
    public void printPlayers()
    {
        String result = "";
        for(Player p : this.players)
        {
            result += p.getName() + ", goals " + p.goals() + "\n";
        }
        System.out.println(result);
    }
    
    public void setMaxSize(int maxSize)
    {
        this.players = new ArrayList<Player>(maxSize);
        this.maxSize = maxSize;
    }
    
    public int size()
    {
        return players.size();
    }
    
    public int goals()
    {
        int sum = 0;
        for(Player p : players)
        {
            sum += p.goals();
        }
        return sum;
    }
}
