//Kangaroo Imlementation Problem Java Solution - Jubin Soni
import java.util.Scanner;

public class Kangaroo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
    	String result = "NO";
        
    	if(result=="NO")
    		for(int i=0;i<10000;i++){
    			x1=x1+v1;
    			x2=x2+v2;
    	
    			if(x1==x2)
    				result = "YES";
    		}
    	else
    		result = "NO";
    	System.out.println(result);
    
    in.close();    	
    }
}



/*
//Just rough work below - Do not refer this
//Kangaroo Problem Rough Solution
import java.util.Scanner;

public class testsums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
       
        String result = (Summation(x1,v1)==Summation(x2,v2)) ? "YES" : "NO";
        System.out.println(Summation(x1,v1)+" "+Summation(x2,v2));
        System.out.println(result);
        in.close();
    }
    
    public static int Summation(int x, int v){
		for(int i=0;i<4;i++){
			x = x+v;
		}
		return x;
    }
}

--------
import java.util.Scanner;

public class testsums {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        do{
        	x1=x1+v1;
        	x2=x2+v2;
        }while(x1 != x2);
        //System.out.println(x1+", "+x2+" YES");
        
        String result = ((x1==x2) && (x1>0 && x2>0)) ? "YES" : "NO";
        System.out.println(result);
        	
    }
}

*/