//Solution to Algorithms -Strings: Pangram in Java
import java.util.*;

public class Pangram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner in = new Scanner(System.in);
    	String s = "";    
    	
    	String text = in.nextLine();
    	String alphabet = "abcdefghijklmnopqrstuvwxyz";
    	
    	String[] textCombine = text.split(" "); //Splitting the String entered by user into words
    	
    	int wordcount = textCombine.length; //Counting the number of words

    	for(int i=0;i<wordcount;i++){
    		 	s = s+textCombine[i]; //Combining all the entered words into single text 
    	}

    	StringBuilder t1 = new StringBuilder(s); //Storing the words into single string

    	s = t1.substring(0,s.length()).toLowerCase(); //Converting all letters into Lower-case

    	char[] chars = s.toCharArray();
    	Arrays.sort(chars); //Sorting all letters into ascending order

    	Set<Character> charSet = new LinkedHashSet<Character>(); //Removing duplicates from the string

    	for (char c : chars) {
    	    charSet.add(c);
    	}

    	StringBuilder sb = new StringBuilder();

    	for (Character character : charSet) {
    	    sb.append(character); //Adding each character back to new string after removing duplicates
    	}

    	StringBuilder sb1 = new StringBuilder(alphabet);
    	
    	int count = 0;
    	
    	for (int i=0;i<sb.length();i++){
    		if(sb.charAt(i)==sb1.charAt(i)) //Comparing each element of the Users string to All letters of English alphabet
    			count++;
    	}

    	if(count==alphabet.length()){ //If count is exactly the same as English alphabets i.e 26 the its a Pangram
    		System.out.println("pangram");
    	}
    	else{ //If count is not 26 then its not a Pangram
    		System.out.println("not pangram");
    	}

    	in.close();
    }
}
