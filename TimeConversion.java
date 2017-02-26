import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        
        String[] parts = time.split(":");
        
        int part1 = Integer.parseInt(parts[0]);
        
        part1 = part1+12;

        if(parts[2].endsWith("AM")){
        	if(part1==24){
        		parts[0]="00";
        	}
        		parts[2] = parts[2].substring(0,parts[2].length()-2);
        		System.out.println(parts[0]+":"+parts[1]+":"+parts[2]);        	        	
        }
        else{
        	if(part1==24){
        		parts[0]="12";
        		parts[2] = parts[2].substring(0,parts[2].length()-2);
        		System.out.println(parts[0]+":"+parts[1]+":"+parts[2]);
        	}
        	else{
        		parts[2] = parts[2].substring(0,parts[2].length()-2);
        		System.out.println(part1+":"+parts[1]+":"+parts[2]);
        	}
        }
        
    }
}
