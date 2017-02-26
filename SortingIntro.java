//Hacker Rank Algorithms Intro to Sorting Challenge Solution
// Algorithms -> Sorting -> Intro to Sorting

import java.util.Scanner;

public class SortingIntro {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
    	
    	int Element = in.nextInt();
    	int n = in.nextInt();
    	int[] a = new int[n];
    	
    	for(int i=0;i<n;i++){
    		a[i] = in.nextInt();
    	}
    	
    	for(int i=0;i<n;i++){
    		if(Element == a[i]){
    			System.out.println(i);
    		}
    	}
    }
}