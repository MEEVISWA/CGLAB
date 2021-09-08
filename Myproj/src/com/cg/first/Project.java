package com.cg.first;

import java.util.Arrays;
public class Project 
{
   public static void main(String[] args) 
   {
      String strInput = "ant";
      if(Order(strInput))
      {
         System.out.println("Given string is in alphabetical order.");
      }
      else
      {
         System.out.println("Given string is not in alphabetical order.");
      }
   }
   static boolean Order(String str)  
   {  
      int size = str.length();  
      char[] chArray = new char[size];  
      for(int a = 0; a < size; a++) 
      {  
         chArray[a] = str.charAt(a);  
      }  
      Arrays.sort(chArray);
      for(int a = 0; a < size; a++)
      {
         if(chArray[a] != str.charAt(a))
         {
            return false;
         }
      }                
      return true;      
   }



	
		
		
		
	}
	


