//Hacker Rank Algorithms BigInteger Solution
// Algorithms -> Dynamic Programming -> BigInteger

import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger{
	
	@SuppressWarnings("static-access")
	public static BigInteger Exponents(BigInteger n, long p){
		
		if(p <= 0){
			return n.ONE;
		}
		else{
			return n.multiply((Exponents(n,p-1)));
		}
	}

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		long number = in.nextLong();
		long exp = in.nextLong();
		long get = in.nextLong();
		long result = 0;
		
		BigInteger r = BigInteger.valueOf(result);
		BigInteger n = BigInteger.valueOf(number);
		BigInteger p = BigInteger.valueOf(exp);				
		
		r = p;
		
		for(int i=2;i<get;i++){
			r = n.add(Exponents(p, 2));
			n = p;
			p = r;
		}
		
		System.out.println(r);
	}
}

/*
TestCase#1: 0 1 10
Output: 84266613096281243382112

TestCase#2: 0 1 5
Output: 5
*/