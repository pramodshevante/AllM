package mocks;

import java.io.IOException;

public class VowelConsonant {

	public static void main(String[] args)
	        throws IOException
	    {
	        String str = "GeeksFor";
	        str = str.toLowerCase();
	        int count = 0;
	        int i;
	 
	        for (i = 0; i < str.length(); i++) {
	            // check if char[i] is vowel
	            if (str.charAt(i) == 'a' || str.charAt(i) == 'e'
	                || str.charAt(i) == 'i'
	                || str.charAt(i) == 'o'
	                || str.charAt(i) == 'u') {
	                // count increments if there is vowel in
	                // char[i]
	                count++;
	            }
	        }
	 
	        // display total count of vowels in string
	        System.out.println("given string containts"+str.charAt(i)+" at teh index"+ i);
	    }
	}