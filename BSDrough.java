import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class testsums {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	
    	Scanner in = new Scanner(System.in);
    	
    	int T = in.nextInt();
    	int N,E,S = 0;
    	
    	for(int i=0;i<T;i++){
    		N = in.nextInt();
    		E = in.nextInt();
    		int count = (N+E)-2;
    		int arraySize = count/2;
    		
    		int[] x = new int[arraySize];
    		int[] y = new int[arraySize];
    		int[] drawLine = new int[arraySize];
    		
    		for(int j=0;j<arraySize;j++){
    			x[j] = in.nextInt();
    			y[j] = in.nextInt();
    			drawLine[j] = x[j]+y[j];
    		}
    		S = in.nextInt();
    		
    		
    		int reachable=0;
    		int unreachable=0;
    		int noEdge=0;
    		String s = "";

    	
    		for(int num=1;num<N;num++){
    			for(int j=0;j<arraySize;j++){
    				if(num==x[j] || num==y[j]){
    					if(drawLine[j] == (x[j]+y[j])){
    						reachable++;
    						//System.out.println(num+", x"+j+": "+x[j]);
    						System.out.print("6"+" ");
    						break;
    					}
    				}
    				else{
    					unreachable++;
    					System.out.print("-1"+" ");
    					noEdge=num;
    					
    					break;
    				}
    			}
    		}
    	    System.out.println();
    	}
    }
}