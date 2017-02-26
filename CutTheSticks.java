//Cut The Sticks Solution in Java - Jubin Soni

import java.util.Arrays;
import java.util.Scanner;

public class CutTheSticks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int count = n;
        int Smallest = 0;

        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

       	for(int arr_i=0; arr_i < n; arr_i++){
       		Arrays.sort(arr);
       		
       		if(arr[arr.length-1] >= arr[arr_i]){
           		Smallest = arr[arr_i];
           	}
       		
       		if (count>0){
       			System.out.println(count);
       		}
       		
       		count=0;
       		if(Smallest>0){
       			for(int arr_j=0; arr_j < n; arr_j++){
       				arr[arr_j] = arr[arr_j] - Smallest;
       				if(arr[arr_j]>0){
       					count++;
       				}
       			}
       		}
        }
       	in.close();
    }
}
