package com.zoho.firsRound;

import java.util.Scanner;
public class Zoho
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
 
        System.out.println("Enter Input String "); // takes input from user
 
        String input = sc.next();
        char[] charArray=input.toCharArray();
        int length=charArray.length;
        if(!input.isEmpty() && length/2!=0)
        {	
        for (int i= 0; i<length; i++)
        {
            for (int j=1; j<length-i; j++)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
            		
            	if((length/2)+k<length)
            	{	
            	System.out.print(charArray[(length/2)+k]);
            	}
            	else 
            	{
           		System.out.print(charArray[k-(length/2)-1]);
            	}
            	
            }
            
             
                System.out.println("");
        }
        sc.close();
        }
        else
        {
        	System.out.println("Enter non empty String with odd length");
        }
    }
}
