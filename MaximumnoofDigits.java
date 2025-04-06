package TCSquestions;

public class MaximumnoofDigits {
	public static void main(String[] args) {
		

	String s="23GF";
	int deci=0;
	for(int n:s.toCharArray()) {int chartonumvalue=0;
	if(Character.isDigit(n)) {
		chartonumvalue=n-'0';
	}
	else {
		chartonumvalue=n-'A'+10;
	}
	deci=deci*17+chartonumvalue;
		
	}
	System.out.println(deci);

}
}
