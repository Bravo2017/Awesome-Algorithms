//Replace the value of HashMap key with its value.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("this", "that");
        map.put("is", "was");
        map.put("like", "for");
        
        String s = in.nextLine();
        
        for (Map.Entry<String, String> entry: map.entrySet()){
        	s = s.replace(entry.getKey(), entry.getValue());
        }
        System.out.println(s);
    }
}