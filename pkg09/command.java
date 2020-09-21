/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex.no.pkg09;


/**
 *
 * @author asus
 */
public class command {
    public static void main(String[] args){   
        int z[]=new int[5];
        String s="happy";
        int a=10;
        int b=0;
        System.out.println("(i) Arithmetic Exception...");
        try
        {
            System.out.println(a/b);
        }
        catch(ArithmeticException e)
        {
            System.out.println("   "+e);
        }
        System.out.println("(ii) ArrayIndexOutOfBounds Exception...");
        try
        {
            System.out.println(z[a]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("   "+e);
        }
        System.out.println("(iii) NumberFormat Exception...");
        try
        {
        int x=Integer.parseInt("111kyhf");
        System.out.println(x);
        }
        catch(NumberFormatException e)
        {
            System.out.println("   "+e);
        }
        System.out.println("(iv) StringIndexOutOfBound Exception...");
        try
        {
            System.out.println(s.charAt(a));
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("   "+e);
        }
    }
    
}
