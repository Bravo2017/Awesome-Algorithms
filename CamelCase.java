//CamelCase Solution HackerRank Jubin Soni

import java.util.Scanner;

public class CamelCase{
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
				
		String[] words = s.split("[A-Z]");
		
		System.out.println(words.length);
		in.close();
	}
}


/*
Alternate Solution - Jubin Soni
import java.util.Scanner;

public class CamelCase{
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		
		String s = in.nextLine();
		char[] c = s.toUpperCase().toCharArray();
		int words = 1;
		
		for(int i=0;i<s.length();i++){
			if (s.charAt(i) == c[i])
				words++;
		}
		System.out.println(words);
		in.close();
	}
}


*/