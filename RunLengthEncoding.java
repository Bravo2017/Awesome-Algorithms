import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    *
 * Complete the function below.
 */

    static String runLengthEncode(String input) {
        String source = input;
        StringBuffer dest = new StringBuffer();
		for (int i = 0; i < source.length(); i++) {
        int runLength = 1;
        while (i + 1 < source.length()
                && source.charAt(i) == source.charAt(i + 1)) {
            runLength++;
            i++;
        }
        dest.append(runLength);
        dest.append(source.charAt(i));
    }
    return dest.toString();

    }

 public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        final String fileName = System.getenv("OUTPUT_PATH");
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        String res;
        String _input;
        try {
            _input = in.nextLine();
        } catch (Exception e) {
            _input = null;
        }
        
        res = runLengthEncode(_input);
        bw.write(res);
        bw.newLine();
        
        bw.close();
    }
}