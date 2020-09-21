/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no.pkg09;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class ExNo09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int temp;
        try
        {
            int a=Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
            if(a<0||b<0)
            {
                throw new exp1("Number should be positive...\nYour input is Negative...");
            }
            if(a>b)
            {
                throw new exp1("Second value should be greater...\nYour input is Lesser...");
            }
            for(int j=a;j<=b;j++)
            {
                temp=0;
                if(j==1)
                {
                    temp=temp+1;
                }
                for(int i=2;i<j;i++)
                {
                    if(j%i==0)
                    {
                        temp=temp+1;
                    }
                            
                }
                if(temp==0)
                {
                    System.out.println(j);
                }
                a++;
            }
        }
        catch(exp1 e)
        {
            System.out.println(e);
        }  
    }
    
}
class exp1 extends Exception
{
    String s;
    exp1(String s1)
    {
        s=s1;
    }
    public String toString()
    {
        return s;
    }
}
