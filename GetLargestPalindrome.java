import java.util.Scanner;

public class GetLargestPalindrome{

    public static boolean reverseCheck(int number){
        String s = Integer.toString(number);
        String reverse = new StringBuffer(s).reverse().toString();
        boolean flag = false;
        
        if (s.equals(reverse)){
            flag = true;
        }
        return flag;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long range = 0;
        for(int i=1; i<=n;i++){
            range = (long) Math.pow(10, i);
        }
        long palindrome = 1;
        long temp = 1;
        
        for(int i=1; i<=range; i++){
            for (int j=i+1; j<=range; j++){
                if(reverseCheck(i*j)==true){
                   temp= i*j;
                   if(palindrome<temp){
                       palindrome = temp;
                   }
                }
            }
        }
        System.out.println(palindrome%1337);
    }
}