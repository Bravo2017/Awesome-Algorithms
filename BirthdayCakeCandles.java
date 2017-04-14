import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = -1;
        int count = 0;
        int height[] = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            
            if (max<height[height_i]){
                max = height[height_i];
                count = 0;
            }
            
            if (max==height[height_i]){
                count+=1;
            }
        }
        System.out.println(count);
    }
    
}
