package problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

/**
 * Created by mrahman on 04/22/17.
 */
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */
  	String input = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

   	String[] words = input.split(" ");
        	
  	        HashMap<String,String> wordMap = new HashMap<String,String>();
        	
        	        for(int i=0;i<words.length;i++) {
        	
        	            String word = words[i].toUpperCase(); // for case insensitive comparison
        	
        	            if(wordMap.get(word)!=null) {
        	
        	                // we found a duplicated word!
        	
        	                System.out.println("Duplicated/Repeated word:"+word);
        	
        	            }else {
        	
        	                wordMap.put(word, word);
        	
        	            }
        	
        	        }

    }

}
