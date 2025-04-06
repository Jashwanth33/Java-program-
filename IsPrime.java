package day11;
import java.util.Scanner;
public class IsPrime {
	 static boolean isprime(int n) {
		if (n<2)
			return false;
		for (int i=2;i<=(int)Math.sqrt(n);i++) {
			if(n%i==0) 
				return false;
			
		}
		return true;
	 }
public static void main(String kk[]) {
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
isprime(n);
sc.close();
System.out.println(isprime(n));
		
	}
}

