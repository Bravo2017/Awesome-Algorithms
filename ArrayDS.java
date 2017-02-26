//DataStructures: Solution to ArrayDS in Java - Jubin Soni

import java.util.Scanner;


public class ArrayDS {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int N = in.nextInt();
    	
    	int[] A = new int[N];
    	
    	for(int i=0;i<N;i++){
    		A[i] = in.nextInt();
    	}
    	
    	for(int i=N-1;i>=0;i--){
    		System.out.print(A[i]+" ");
    	}
    	
    	in.close();
    }
}