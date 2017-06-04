package interview.recursion;

public class StringReversal {
	
	public static void main(String[] args) {
		System.out.println(reverse("hello world", "")); //irah irah olob
	}
	
	public static String reverse(String str, String output){
		int i = str.length();
		
		if (i<=0){
			return output;
		}
		output += ""+str.charAt(str.length()-1);
		return reverse(str.substring(0,str.length()-1),output);
		
	}

}
