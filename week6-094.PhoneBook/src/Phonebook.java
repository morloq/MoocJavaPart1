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
public class Phonebook {
    private ArrayList<Person> persons = new ArrayList<Person>();
    
    public Phonebook()
    {
        
    }
    
    public void add(String name, String number)
    {
        Person person = new Person(name, number);
        persons.add(person);
    }
    
    public void printAll()
    {
        for(Person p : persons)
        {
            System.out.print(p.getName() + " " + p.getNumber() +"\n");
        }
    }
    
    public String searchNumber(String name)
    {
        for(Person p : persons)
        {
            if(!p.getName().equals(name))
            {
                continue;
            }
            if(p.getName().equals(name))
                return p.getNumber();
        }
        return "number not known";
    }
}
