package strings;
/*
 * You are working in a chemical factory. 
 * Each chemical in the factory is represented by a string. 
 * You have to group the chemicals in such a way that no two explosive chemicals are together.
 * You are given an array of size N, denoting the names of N chemicals. 
 * Let x and y be two strings representing two chemicals.
 * Let z = x + x (For example, if x="abc" then z="abcabc").
 * The chemicals x and y are said to be explosive if we can jumble the characters of string z to get chemical y. 
 * Your task is to return the number of pairs of chemicals that are explosive.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class chemicalFactory {

    public boolean isExplosive(String x, String y)
    {
        String z = x+x;
        int i;
        String sym = "%";
        for(i = 0; i < y.length();i++)
        {
            char ch = y.charAt(i);
            if(z.contains(Character.toString(ch)))
            {
                z.replaceFirst(Character.toString(ch),sym);
            }
            else
                break;
        }
        if (i == y.length())
            return true;

        return false;
    }


    public static void main(String[] args) {
        
        Scanner scr = new Scanner(System.in);
        ArrayList<String> str = new ArrayList<>();
        chemicalFactory cf = new chemicalFactory();
        int count = 0;
        int n;
        System.out.println("Enter the number of chemicals :");
        n = scr.nextInt();
        scr.nextLine();
        System.out.println("Enter the chemical names one by one :");
        for(int i = 0; i < n; i++)
        {
            String temp = scr.nextLine();
            str.add(temp);
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n;j++)
            {
                if(cf.isExplosive(str.get(i),str.get(j)))
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
    
}


/*
 * output:
 * Enter the number of chemicals :
    4  
    Enter the chemical names one by one :
    abc
    ww
    aa
    bc
    2

    Enter the number of chemicals :
    3
    Enter the chemical names one by one :
    aaa
    bbb
    ccc
    0


    Enter the number of chemicals :
    5
    Enter the chemical names one by one :
    abc
    bca
    cba
    xyz
    xy
    4
 */