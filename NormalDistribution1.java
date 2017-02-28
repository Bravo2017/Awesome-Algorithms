import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class NormalDistribution1 {
	
	public static double erf(double z) {
		double t = 1.0 / (1.0 + 0.5 * Math.abs(z));
		//use Horner's method
		double ans = 1 - t * Math.exp( -z*z   -   1.26551223 +
                                                t * ( 1.00002368 +
                                                t * ( 0.37409196 + 
                                                t * ( 0.09678418 + 
                                                t * (-0.18628806 + 
                                                t * ( 0.27886807 + 
                                                t * (-1.13520398 + 
                                                t * ( 1.48851587 + 
                                                t * (-0.82215223 + 
                                                t * ( 0.17087277))))))))));
		if (z >= 0) return  ans;
		else        return -ans;
	}
	
	public static double normal(double x, double mean, double stdev){
		double normal = 0;
		normal = 0.5*(1 + erf((x-mean)/(Math.sqrt(2)*stdev)));
		return normal;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.###");
		
		double x = 19.5;
		double mean = 20;
		double stdev = 2;
		
		System.out.println(df.format(normal(x,mean,stdev)));
		
		System.out.println(df.format(Math.abs(normal(22,mean,stdev)-normal(20,mean,stdev))));
	}
    	
    	
}
