package day11;
import java.util.Scanner;
public class Isfib {
	static boolean isfib(int n)
	{
		
		int x=5*n*n-4;
		int y=5*n*n+4;
		int a=(int)Math.sqrt(x);
		int b=(int)Math.sqrt(y);
		if(a*a==x||b*b==y)
			return true ;	
		return false;
	}
	public static void main(String kk[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		System.out.println(isfib(n));
	}
}

