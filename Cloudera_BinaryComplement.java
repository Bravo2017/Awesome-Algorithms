import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/*
	 * Complete the function below.
	 */
	public static String getBinary(int n){
	       if (n == 0) {
	           return "0";
	       }
	       
	       String binary = "";
	       while (n > 0) {
	           int rem = n % 2;
	           binary = rem + binary;
	           n = n / 2;
	       }
	       return binary;
	}

	    static int getIntegerComplement(int n) {
	    	String s = getBinary(n);
	    	double sum=0;
	    	for(int i=0;i<s.length();i++){
	    		if(s.charAt(i)=='0'){
	    			sum+=Math.pow(2, s.length()-i);
	    		}
	    	}
	    	return (int) sum/2;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int res;
	        int _n;
	        _n = Integer.parseInt(in.nextLine());
	        
	        res = getIntegerComplement(_n);
	        System.out.println(res);
	        
	    }
	}