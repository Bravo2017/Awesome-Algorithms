import java.util.Scanner;

public class testsums {

    public static void insertIntoSorted(int[] ar) {
        // Fill up this function 
    	for(int i=1;i<ar.length-1;i++){
    		int x = ar[i];
    		int j=0;
    		while(j>0 && ar[j-1]>ar[j]){
    			ar[j+1] = ar[j];
    			j = j-1;
    		}
    		ar[j+1] = x;
    		printArray(ar);
    	}
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
        for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
        }
        insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }
}
 
