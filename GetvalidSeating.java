package jpmorgan;

import java.util.*;
class BinaryValue{
 public static String GetvalidSeating(int n) {
  	int count=0;
	    int number=1;
	while(count<n) {
		if(isValid(number)) {
			count++;
		}
		number++;
	}
		return Integer.toBinaryString(number-1);
	}
private static boolean isValid(int num) {
			String binarystring=Integer.toBinaryString( num);
			return !binarystring.contains("11");
		}
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int t=sc.nextInt();
	for(int i=0;i<t;i++) {
		int n=sc.nextInt();
		System.out.println(GetvalidSeating(n));
	}
}
}
