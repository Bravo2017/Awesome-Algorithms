import java.util.Scanner;

public class MergeSort {
	//SelectionSort
	public static void SelectionSort(int[] x){
		int min=0;
		for(int i=0;i<x.length;i++){
			min = i;
			for(int j=i+1;j<x.length;j++){
				if (x[j] < x[min]){
					min = j;
				}
			}
			int temp = x[i];
			x[i] = x[min];
			x[min] = temp;
		}
		for(int i=0;i<x.length;i++){
			System.out.println(x[i]);
		}
	}
	
	public static void main(String[] args) {
		int[] a = new int[8];
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<8;i++){
			a[i] = in.nextInt();
		}
		
		SelectionSort(a);
	}

}
