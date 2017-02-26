//DataStructures: 2DArrays Solution in Java - Jubin Soni
import java.util.Arrays;
import java.util.Scanner;

public class 2DArrays {
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	
    	int[][] A = new int[6][6];
    	int SubArray=0;
    	int Sides=0;	
    	String HourGlass = "";
    	
    	for(int i=0;i<6;i++){
    		for(int j=0;j<6;j++){
    			A[i][j] = in.nextInt();
    		}
    	}
    	
    	for(int h=0;h<4;h++){
    		for(int v=0;v<4;v++){
    			for(int i=h;i<h+3;i++){
    				for(int j=v;j<v+3;j++){
    					SubArray = SubArray+(A[i][j]);
    				}
    			}
    	
    			for(int i=h;i<h+3;i++){
    				i++;
    				for(int j=v;j<v+3;j++){
    					if(i<h+3){
    						Sides = Sides + (A[i][j]);
    						//System.out.println("A["+i+j+"]: "+A[i][j]);
    					}
    					j++;
    				}
    			}
    			HourGlass = HourGlass+((SubArray)-(Sides)) + " ";
    			//System.out.println("HourGlass"+h+": "+HourGlass+", "+SubArray+", "+Sides);
    			
    			SubArray=0;
    			Sides=0;    		}
    	}
    	//System.out.println(HourGlass);
    	String[] numbers = HourGlass.split(" ");
    	int[] num = new int[16];
    	
    	for(int i=0;i<numbers.length;i++){
    		num[i] = Integer.parseInt(numbers[i]); 
    	}
    	
    	Arrays.sort(num);
    	System.out.println(num[num.length-1]);
    	
    	in.close();
    }
}