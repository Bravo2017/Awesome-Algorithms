//Hacker Rank Algorithms MaximizingXOR Solution
// Algorithms -> Bit Manipulation -> MaximizingXOR
import java.util.*;

public class MaximizingXOR {
/*
 * Complete the function below.
 */

    static int maxXor(int l, int r) {
    	int res = 0;
    	int n=r-l;
    	int temp=l;
    	int maXOR = 0;
    	
    	for(int i=0;i<n;i++){
    		
    		for(int j=0;j<n;j++){

    			res = l^r; //^ is XOR operator
    			if(maXOR<res){
    				maXOR = res;
    			}
    			//System.out.println(l+"^"+r+": "+res);
    			l++;
    		}
    		l=temp;
    		r--;
    	}

    	return maXOR;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
