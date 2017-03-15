//CandyReplenishingRobot.java
//@author: jubinsoni
import java.util.Scanner;

public class CandyReplenishingRobot{
    
	public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	int t = in.nextInt();
    	int[] c = new int[t];
    	
    	int bowl = n;
    	int c_added = 0;
    	
    	for (int i=0; i<t; i++){
    		c[i] = in.nextInt();
    		bowl = bowl - c[i];
    		//System.out.print(bowl+" ");
    		if(bowl < 5 & i != t-1){
    			c_added = c_added+n-bowl;
    			bowl = n;
    		}
    	}
    	
    	System.out.println(c_added);
    	
    	
    	in.close();
    }
}