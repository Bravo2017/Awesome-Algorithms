import java.util.Scanner;

/**
 * @author Jubin Soni
 * 
 * Solution to Problem - https://www.hackerrank.com/challenges/jumping-on-the-clouds
 *
 */
public class JumpingOnClouds {
	
	public static void main(String[] args) {
		final Scanner in = new Scanner(System.in);
		final int N = in.nextInt();
		
		// Put all the clouds in an array
		final int[] clouds = new int[N];
		for(int i = 0; i < N; i++) {
			clouds[i] = in.nextInt();
		}
		
		// Check if two steps can be taken by verifying cloud type at 
		// second step. Otherwise check if one step can be taken by verifying 
		// if we still have any more clouds. If none of these conditions are met,
		// break out of infinite loop.
		int noOfJumps = 0, i = 0;
		while(true) {
			if(i + 2 < N && clouds[i + 2] == 0) {
				i += 2;
			} else if(i + 1 < N) {
				i++;
			} else {
				break;
			}
			noOfJumps++;
		}
		
		System.out.println(noOfJumps);
		
		in.close();
	}

}

/*
//Jump on clouds-Hacker Rank Challenge Solution - todo

import java.util.Scanner;

public class JumpingClouds{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int[] c = new int[n];
		int jump = -1;
		
		for(int i=0;i<n;i++){
			c[i] = in.nextInt();
		}
		
		for(int i=0;i<n;i++){
			jump++;
			System.out.println("c["+i+"]: "+c[i]);
			if(i<n-2 && c[i]==0){
				//System.out.println("c["+i+"]: "+c[i]);
				i++;
			}
		}
		
		System.out.println(jump);
		
		in.close();
	}
}

*/