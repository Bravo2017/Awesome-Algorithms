import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int[] a = new int[n];
    	
    	for(int i=0; i<n; i++){
    		a[i] = in.nextInt();
    	}
    	Arrays.sort(a);
    	
    	int min = Math.abs(a[0]-a[1]);
    	
    	for(int i=0; i<n-1 ;i++){
    		if(Math.abs(a[i+1]-a[i]) < min){
    			min = Math.abs(a[i+1]-a[i]);
    		}
    	}
    	System.out.println(min);
	}
}
