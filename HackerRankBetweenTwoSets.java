import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getTotalX(int[] a, int[] b){
        int x = a[0];
        int count = 0;
        int totalX = 0;
        while (x <= b[b.length-1]){
            for (int i=0; i<a.length; i++){
                if (x % a[i] == 0){
                    count++;
                }
            }
            
            for (int i=0; i<b.length; i++){
                if (b[i] % x == 0){
                    count++;
                }
            }
            
            if (count == (a.length + b.length)){
                totalX++;
            }
            x++;
            count=0;
        }
        return totalX;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(a, b);
        System.out.println(total);
    }
}
