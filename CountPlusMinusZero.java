import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class testsums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        
        float total = 0,
        positive = 0,
        negative = 0,
        zero = 0;
        
        for(int arr_i=0; arr_i < n; arr_i++){
            if(arr[arr_i]>0){
            	positive++;
            }
            else if(arr[arr_i]<0){
            	negative++;
            }
            else if(arr[arr_i] == 0){
            	zero++;
            }
            total++;
        }
        positive = positive/total;
        negative = negative/total;
        zero = zero/total;
        System.out.println(positive+"\n"+negative+"\n"+zero);
    }
}
