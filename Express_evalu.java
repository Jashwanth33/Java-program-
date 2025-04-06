package day12;

import java.util.Scanner;

public class Express_evalu {
	static int findValue (int a, int b) {
		int m=(int)Math.pow(a, 3);
		int n=(int)Math.pow(a, 2);
		int o=(int)Math.pow(b, 3);
		int p=(int)Math.pow(b, 2);
	int r=m+n*b+2*n*b+2*a*p+a*p+o;
	return r;	
	 }
public static void main(String kk[]) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	sc.close();
	findValue(a,b);
	System.out.println(findValue(a,b));
	
}

}
