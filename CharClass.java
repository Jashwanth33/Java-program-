package day20;

public class CharClass {
	public static void main(String[] args) {
		String s="VELtech";
		char c[]=s.toCharArray();
		int uc=0;
		int lc=0;
		for(char t:c) {
			if( Character.isUpperCase(t)) uc++;
			if( Character.isLowerCase(t)) lc++;
			
		}
		System.out.println(uc);
		System.out.println(lc);
	}

}
