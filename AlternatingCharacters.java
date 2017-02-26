//Alternating Characters HAcker Rank Algorithms Solution Jubin Soni

import java.util.Scanner;

public class AlternatingCharacters{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String x = in.nextLine();
		
		for(int i=0;i<n;i++){
			String T = in.nextLine();
			System.out.println(duplicateCount(T));
		}
		
		in.close();
	}
	
	public static int duplicateCount(String T){
		int count=0;
		for(int i=0;i<T.length()-1;i++){
			if(T.charAt(i)== T.charAt(i+1)){
				count++;
			}
		}
		return count;
	}
}
