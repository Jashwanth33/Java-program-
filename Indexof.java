package day20;

public class Indexof {
	static String getindex(String s) {
		String ans=" ";
		for(char t : s.toCharArray()) {
			if(ans.indexOf(t)<0)
				ans=ans+t;
		}
		return ans;
			
	}
	
	public static void main(String[] args) {
		String s="VELTECH";
		String ans=getindex(s);
		System.out.println(ans);

}
}// this is method 2 for finding unique characters
