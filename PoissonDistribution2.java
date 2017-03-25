import java.text.DecimalFormat;
import java.util.Scanner;

public class PoissonDistribution2 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.###");
		double lambdaA = 0.88; //Mean or Avg of success
		double lambdaB = 1.55;
		double cA = 160 + 40*(lambdaA+(lambdaA*lambdaA));
		double cB = 128 + 40*(lambdaB+(lambdaB*lambdaB));
		
		System.out.println(df.format(cA));
		System.out.println(df.format(cB));
		
		in.close();
	}
}