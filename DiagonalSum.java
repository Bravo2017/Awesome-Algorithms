import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        
        int sum1 = 0;
        int sum2 = 0;
        int d = 0;
        
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){                              
                sum1= sum1+a[a_i][a_j];
                a_i++;
            }
        }        
        
        int counter1 = n-1;
        int counter2 = 0;
        for(int a_i=0; a_i < n;a_i++){        	
            for(int a_j=0; a_j < n; a_j++){
            	if(a_j == counter1 && a_i == counter2){
                sum2 = sum2+a[a_i][a_j];
                counter1--;
                counter2++;
            	}            
            }        
        }        
        d = sum1-sum2;
        if (d<0){
        	d = d-d-d;        	
        }
        System.out.println(d);
    }
}
