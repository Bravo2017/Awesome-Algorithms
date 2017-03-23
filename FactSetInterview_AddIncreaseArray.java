import java.util.Scanner;
/*

[2, 5, 6] -> [2, 5, 7]
[1, 2, 9] -> [1,3,0]
[9,9] -> [1,0,0]
[4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4]
*/

public class Solution{
	public static int[] getNewArr(int array[]){
		int[] newarray = new int[array.length];
		for(int i=newarray.length-1; i>=0; i--){
            if(array[i]+1 > 9){
            	newarray[i] = 0;
            }
            else if(newarray[i+1]==0){
            	newarray[i] = array[i]+1; //2 8 9
            }
            else{
            	newarray[i] = array[i];
            }
        }
		return newarray;
	}
	
    public static void main(String[] args){

    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] array = new int[n];
    
    for(int i=0; i< array.length; i++){
        array[i] = in.nextInt();
    }
    
    //int arr[] = {2,5,6};
    int currentSize = array.length;// 3
    int lastElement= array[array.length-1]+1;//array[2]+1 -> 7
    
    if(array[0]==9){
    	int[] newarray = new int[array.length+1];
    	newarray[0] = 1;
    	int[] temp = getNewArr(array);
        for(int i=1; i<newarray.length; i++){
            newarray[i] = temp[i-1];
        }
        for(int i=0; i<newarray.length; i++){
        	System.out.print(newarray[i]+" ");
        }
    }
    else if(array[array.length-1]==9 && array[0]<9){
    	int[] newarray = getNewArr(array);
        for(int i=0; i<newarray.length; i++){
            System.out.print(newarray[i]+" ");
        }
    }

    else{
    	int[] newarray = new int[currentSize];//4
        for(int i=0; i< newarray.length; i++){
            newarray[i] = array[i];
            if(i==newarray.length-1){
                newarray[i] = lastElement;
            }
            System.out.print(newarray[i]+" ");
        }
    }
    in.close();
    }
}