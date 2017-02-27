//Permutations

import java.util.Arrays;
import java.util.Scanner;

public class testsums{ 
	static String p = "";
	static String temp = "";

	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		permutation(s);
		
		
		/*
		int n = in.nextInt();
		for(int i=0;i<n+1;i++){
			String s = in.nextLine();
			permutation(s);
			String pArray[] = p.split(" ");
			Arrays.sort(pArray);
			
			for(int j=0;j<pArray.length-1;j++){
				if(s.compareTo(s)==s.compareTo(pArray[j])){
					if(s.compareTo(s)==s.compareTo(pArray[j+1])){
						System.out.println("no answer");
						break;
					}
					else{
						System.out.println(pArray[j+1]);
						break;
					}
				}
			}
			p="";
		}
		in.close();
		*/
	}
	
	public static void permutation(String str){
		permutation("",str);
	}
	
	private static void permutation(String prefix, String str){
		int n = str.length();
		
		if(n==0){
			//p = p + prefix + " ";
			p = prefix;
			//if(p.compareTo(prefix)==temp)
				
			temp = prefix;
			System.out.println(prefix);
		}
		
		else{
			for(int i=0;i<n;i++){
				permutation(prefix+str.charAt(i),str.substring(0,i)+str.substring(i+1,n));
			}
		}
	}
}
