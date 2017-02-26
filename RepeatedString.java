//Hacker Rank Algorithms: RepeatedString - Jubin Soni
public class RepeatedString{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		String s = in.next();
		long n = in.nextLong();
		long a=0;
		int rem = (int) (n%s.length());
		
		a=getCount(s);
		a = (int) a*(n/s.length());
		
		if(n%s.length()==0){
			System.out.println(a);
		}
		else{
			System.out.println(a+getCount(s.substring(0,rem)));
		}
		
		in.close();
	
	}
	
	public static int getCount (String s){
		int a=0;
		for(int i=0;i<s.length();i++){
			if(s.charAt(i)=='a'){
				a++;
			}
		}
		return a;
	}
}