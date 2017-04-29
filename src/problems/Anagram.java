package problems;

import java.util.ArrayList;

/**
 * Created by mrahman on 04/22/17.
 */
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
    	String s1= "CAT"; 
    	String s2= "ACT";  
    	int b=0,c=0;
    	if(s1.length()!=s2.length())
    	   System.out.print("No Anagram");
    	else {
    	   for(int i=0;i<s1.length();i++) {
    	      char s = s1.charAt(i);
    	      for(int j=0;j<s2.length();j++) {
    	         if(s==s2.charAt(j)){
    	            b++;
    	         } 
    	      }
    	      if(b==0)
    	         break;
    	   }
    	   if(b==0)
    	      System.out.print("No Anagram");
    	   else 
    	      System.out.print("YES Anagram to each other");
    	} 
    	    	
    }
}
