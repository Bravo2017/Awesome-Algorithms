//DivisibleSumPairs Java Solution - Jubin Soni

import java.util.Scanner;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int count = 0;
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int a_i=0;a_i<n;a_i++){
        	for(int a_j=a_i+1;a_j<n;a_j++){

        		if ((a[a_i] + a[a_j])%k == 0){
        			count++;
        		}
        	}
        }
        
        System.out.println(count);
    }
}
