//Hackerrank String Solution GemStones

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class GemStones{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		
		Set<Character> set = convertToSet(in.next());
		
		for(int i=1; i<T; i++){
			set.retainAll(convertToSet(in.next()));
		}
		
		System.out.println(set.size());
	}
	
	public static Set<Character> convertToSet(String s){
		Set<Character> set = new HashSet<Character>(26);
		for(char c : s.toCharArray()){
			set.add(Character.valueOf(c));
		}
		return set;
	}
}


/*
 *import java.util.Scanner;

public class GemStones{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = Integer.parseInt(in.nextLine());
		N=N-1;
		String[] g1 = in.nextLine().split(""); //input first string
		
		String[] g = new String[N];
		
		for(int i=0;i<N;i++){ //input rest strings
			g[i] = in.nextLine();
		}
		
		String s = "";
		String q = "";
		
		for(int i=0;i<N;i++){
			for(int j=0;j<g1.length;j++){
				System.out.println(g[i]+" "+g1[j]);
				if(g[i].contains(g1[j]) && !s.contains(g1[j])){
					s = s+g1[j];
				}
			}
			System.out.println(s);
		}
		System.out.println(s);
		
	}
} 
 */
