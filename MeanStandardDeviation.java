import java.util.Scanner;

public class Solution {
	public static double stdDev(double[] a){
		double mean = Mean(a);
		double sum = 0;
		for(int i=0; i<a.length; i++){
			sum+=Math.pow(mean-a[i], 2);
		}
		return Math.sqrt(sum/a.length);
	}
	
	public static double Mean(double[] a){
		double sum = 0;
		for(int i=0; i<a.length; i++){
			sum+=a[i];
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		double[] a = new double[N];
		for(int i=0; i<N; i++){
			a[i] = in.nextDouble();
		}
		
		System.out.println("Mean: "+Mean(a)+"\nStd Dev: "+stdDev(a));
		in.close();
		/*INPUT:
		 10
		 11 9 5 2 15 16 30 70 46 48
		 */
	}
}