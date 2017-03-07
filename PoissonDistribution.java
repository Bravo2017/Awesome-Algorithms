import java.text.DecimalFormat;
import java.util.Scanner;

public class PoissonDistribution {
	public static double Factorial (double N){
		double Factorial = 1;
		for(int i=1; i<=N; i++){
			Factorial = Factorial * i;
		}
		return Factorial;
	}
	
	public static double PoissonDist(double k, double lambda){
		double e = 2.71828;
		double Poisson = 1;
		Poisson = Math.pow(lambda, k)*Math.pow(e, (-lambda)) / Factorial(k);
		return Poisson;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.###");
		double lambda = 2.5;
		double k = 5;
		System.out.println(df.format(PoissonDist(k,lambda)));
		in.close();
	}
}