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
public class EnterGrades {
    private ArrayList<Integer> points;
    
    public EnterGrades()
    {
        this.points = new ArrayList<Integer>();
    }
    
    public ArrayList<Integer> enterScores(Scanner reader)
    {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        System.out.println("Type exam scores, -1 completes:");
        int input = 0;
        while(input != -1)
        {
            input = Integer.parseInt(reader.nextLine());
            if(input != -1 && input >= 0 && input <= 60)
            {
                scores.add(input);
            }
        }
        return scores;
    }
    
    public ArrayList<Integer> GradeDistribution(ArrayList<Integer> scores)
    {
        ArrayList<Integer> distribution = new ArrayList<Integer>();
        for(int x : scores)
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
    
    public void printDistribution(ArrayList<Integer> distribution)
    {
        System.out.println("Grade distribution:");
        int zero = 0, one = 0, two = 0, three = 0, four = 0, five = 0;
        ArrayList<String> zero0 = new ArrayList<String>();
        ArrayList<String> one1 = new ArrayList<String>();
        ArrayList<String> two2 = new ArrayList<String>();
        ArrayList<String> three3 = new ArrayList<String>();
        ArrayList<String> four4 = new ArrayList<String>();
        ArrayList<String> five5 = new ArrayList<String>();
        one1.add("1: ");
        zero0.add("0: ");
        two2.add("2: ");
        three3.add("3: ");
        four4.add("4: ");
        five5.add("5: ");
        for(int x : distribution)
        {
            switch (x) {
                case 0:
                    zero++;
                    zero0.add("*");
                    break;
                case 1:
                    one++;
                    one1.add("*");
                    break;
                case 2:
                    two++;
                    two2.add("*");
                    break;
                case 3:
                    three++;
                    three3.add("*");
                    break;
                case 4:
                    four++;
                    four4.add("*");
                    break;
                default:
                    five++;
                    five5.add("*");
                    break;
            }
        }
        int sum = one + two + three + four + five;
        int all = zero + one + two + three + four + five;
        for(String x : five5)
        {
            System.out.print(x);
        }
        System.out.println("");
        for(String x : four4)
        {
            System.out.print(x);
        }
        System.out.println("");
        for(String x : three3)
        {
            System.out.print(x);
        }
        System.out.println("");
        for(String x : two2)
        {
            System.out.print(x);
        }
        System.out.println("");
        for(String x : one1)
        {
            System.out.print(x);
        }
        System.out.println("");
        for(String x : zero0)
        {
            System.out.print(x);
        }
        System.out.println("");
        double acceptance = 0.0;
        if(all != 0)
        {
            acceptance = (100*sum)/all;
        }
        else
            acceptance = 0;
        System.out.println("Acceptance percentage: " + acceptance);
    }
}
