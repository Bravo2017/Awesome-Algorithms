import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static int[] leftRotate(int[] a, int n, int d){
        if (d <= 0){
            return a;
        }else{
            int first = a[0];
            for(int i=0; i<n-1; i++){
                a[i] = a[i+1];
            }
            a[n-1] = first;
            return leftRotate(a, n, d-1);
        }
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            arr[i] = in.nextInt();
        }
        
        leftRotate(arr, n, d);
        
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}