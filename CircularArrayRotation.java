//Circular Array Rotation Solution in Java - Jubin Soni

import java.util.Scanner;

public class CircularArrayRotation {

	public static void main(String[] args) {
	    Scanner in=new Scanner(System.in);
	    int N=in.nextInt();
	    int K=in.nextInt();
	    int Q=in.nextInt();
	    int rotation=K%N;
	    int[] arr=new int[N];
	    
	    //System.out.println(rotation);
	    
	    for (int i=0;i<N;i++){
	    	arr[i] = in.nextInt();
	    }
	    
	    for (int i=0;i<Q;i++){
	    	int m = in.nextInt();
	    	if(m-rotation >= 0){
	    		System.out.println(arr[m-rotation]);
	    	}
	    	else{
	    		System.out.println(arr[m-rotation+arr.length]);
	    	}
	    }
}
}
