package day31;

public class Ismatching {
	public static void main(String[] args) {
		String s="(){}{}";
		boolean b= Ismatching(s);

		System.out.println(b);
	}

	private static boolean Ismatching(String s) {
	int c1=0, c2=0,c3=0;
	for(char c :s.toCharArray()) {
		if(c=='(') c1++; if(c==')') c1--;
		if(c=='{') c2++; if(c=='}') c2--;
		if(c1>0||c2>0)
			return false;
		if(c1==0&&c2==0)
			return true;
		return false;
		
	}
	
		return false;
	}

}
