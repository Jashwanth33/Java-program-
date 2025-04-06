package jpmorgan;
import java.util.*;
public class Base20 {
	public static int convertToDecimal(String num) {
		
  int result =0;
  int length=num.length();
  for(int i=0;i<length;i++) {
	  int value=num.charAt(i)-'a'+1;
	  result=result*20+1;
  }
  return result;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(convertToDecimal(s));
	

	}

}
