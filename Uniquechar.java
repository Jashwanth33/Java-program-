package day20;
import java.util.Arrays;
import java.util.HashSet;
public class Uniquechar {
	static String getUnique(String s) {
		HashSet set1= new HashSet();
		for(char t : s.toCharArray()) {
			set1.add(t);
	}
	return set1.toString();
}
	public static void main(String[] args) {
		String s="VELTECH";
		String ans=getUnique(s);
		System.out.println(ans);
		System.out.println("Sort the answer");
		char c[]=ans.toCharArray();
		Arrays.sort(c);
		String ans2= new String(c);
		ans2=ans2.trim();
		ans2=ans2.replace("," ,"");
		ans2=ans2.replace("[" ,"");
		ans2=ans2.replace("]" ,"");
		System.out.println(c);
		System.out.println("array sort"+c);
		System.out.println(ans2);
		String ans3=new String(ans2);
		ans3=ans3.substring(0);
		System.out.println("all substring");
		System.out.println(ans);
		
		
	}

}
