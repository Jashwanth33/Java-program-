package day19;

import java.util.Iterator;

public class Asciisum {
	static int getAsciiSum(String s) {
		int ans=0;
		for(char t:s.toCharArray()) {
			ans=ans+t;
		//for(int i=0;i<s.length();i++) {
			//ans=ans+s.charAt(i);
			
		}
		
		
		return ans;
	}

	public static void main(String[] args) {
		
		String s="eeeeee";
		int sum=getAsciiSum(s);
		System.out.println(sum);
		
		}
	}


