/*Beautiful Binary String Solution Java
 *
 */
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BeautifulBinaryString{
	public static void main(String[] args) {	
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		String x = in.nextLine();
		String s = in.nextLine();
		String pattern = "010";
		
		Pattern p = Pattern.compile("010");
		Matcher m = p.matcher(s);
		n=0;
		while(m.find()){
			n++;
		}
		System.out.println(n);
	}
}

