package day19;

import java.util.Arrays;
public class Str_sorting {
	public static void main(String[] args) {
		String s1="call spoofing";
		String s2="vishing";
		String s3="spear phishing";
		String s4="CIA";
		String s[]= {s1,s2,s3,s4};
		Arrays.parallelSort(s);
		for(String t: s)
			System.out.println(t);
		
	}

}
