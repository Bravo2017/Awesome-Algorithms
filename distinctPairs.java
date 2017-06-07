package interview.algorithms;

import java.util.HashMap;

public class distinctPairs {
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,7,5,9,2,12,3};
		int k = 3;
		System.out.println(distinctPairs(arr,k));
	}
	
	public static int distinctPairs(int arr[], int k){
		int count = 0;
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for (int i=0; i<arr.length; i++){
			hm.put(arr[i], i);
		}
		
		for(int i=0; i<arr.length; i++){
			if(hm.containsKey(arr[i]+k)){
				count++;
			}
		}
		return count;
	}

}
