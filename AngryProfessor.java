import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class testsums {

    public static void main(String[] args)
    {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc=new Scanner(System.in);
    int test=sc.nextInt();
    while(test>0)
    {
    int n=sc.nextInt();
    int k=sc.nextInt();
    int ontime=0;   
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
         {
            arr[i]=sc.nextInt();
            if(arr[i]<=0)
                ontime++;
        }
        if(ontime>=k)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}
}