import java.text.DecimalFormat;
import java.util.Scanner;

public class PearsonCoefficient1 {
	
	public static double Mean(double[] Arr){
		double sum = 0;
		double n = Arr.length;
		for(int i=0;i<Arr.length;i++){
			sum += Arr[i];
		}
		double mean = sum/n;
		return mean;
	}
	
	public static double StdDev(double[] Arr){
		double sum = 0;
		double n = Arr.length;
		double mean = Mean(Arr);
		for(int i=0;i<Arr.length;i++){
			sum += Math.pow((Arr[i] - mean), 2);
		}
		double stdev = Math.sqrt(sum/n);
		return stdev;
	}
	
	public static double Pearson(double[] X, double[] Y){
		double meanX = Mean(X);
		double meanY = Mean(Y);
		double stdevX = StdDev(X);
		double stdevY = StdDev(Y);
		double n=X.length;//X,Y same size
		double sum=0;
		double pearsonCoeff = 0;
		for(int i=0;i<n;i++){
			sum += (X[i]-meanX)*(Y[i]-meanY);
		}
		
		pearsonCoeff = sum/(n*stdevX*stdevY);
		return pearsonCoeff;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("###.###");
		int n = in.nextInt();
		double[] X = new double[n];
		double[] Y = new double[n];
		
		for(int i=0;i<n;i++){
			X[i] = in.nextDouble();
		}
		
		for(int i=0;i<n;i++){
			Y[i] = in.nextDouble();
		}
		System.out.println(df.format(Pearson(X, Y)));
		
		in.close();
	}
}
