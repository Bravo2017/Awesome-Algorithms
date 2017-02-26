//MaxIndexDifference - Stryker Challenge (First 2 Test case pass, rest 6 Failed)


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class MaxIndexDifference{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		HashMap<Integer, Integer> hmapA = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> hmapB = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> index = new HashMap<Integer, Integer>();
		
		for(int i=0;i<n;i++){
			int A = in.nextInt();
			hmapA.put(i, A);
		}
		
		for(int i=0;i<n;i++){
			int B = in.nextInt();
			hmapB.put(i, B);
		}
		
		List<Integer> vB = new ArrayList<Integer>(hmapB.values());
		
		for(int i=0;i<n;i++){
			if(hmapB.containsValue(hmapA.get(i))){
				index.put(Math.abs(i-vB.indexOf(hmapA.get(i))),hmapA.get(i));
			}
		}
		List<Integer> indexKey = new ArrayList<Integer>(index.keySet());
		indexKey.sort(null);
		indexKey.toArray();
		
		
		if (index.get(indexKey.get(0)) > index.get(indexKey.get(1))){
			System.out.println(index.get(indexKey.get(1)));
		}
		else{
			System.out.println(index.get(indexKey.get(0)));
		}
		
		in.close();
	}
}