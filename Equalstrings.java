package day19;

public class Equalstrings {
	public static void main(String[] args) {
		String s1="level";
		String s2="HELLO";
		int ans=s1.compareTo(s2);
		System.out.println(ans);
		if(ans==0)
			System.out.println("palindrome");
	 boolean b1=s1.equals(s2);
	 boolean b2=s1.equalsIgnoreCase(s2);
	 System.out.println(b1);
	 System.out.println(b2);
	 //palindrome
	 String r="";
	 for(int i=0;i<s1.length();i++)
	 {
		 r=s1.charAt(i)+r;
		 
	 }
	 System.out.println(r);
	 if(r.equals(s1))
		 System.out.println("yes palindrome");
	 else
		 System.out.println("Not a palindrome");
		 
		 
	}

}
