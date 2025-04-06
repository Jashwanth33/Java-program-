package day12;
import java.util.Scanner;
 class Oddseries {
	static void  oddSeries(int n) {
		int c=0,m=1;
		while(c<n) {
			if(m%2!=0) {
				System.out.println(m);
				c++;
			}m++;
		}
	}

public static void main(String kk[]) {
	Scanner sc=new Scanner(System.in);
	int n= sc.nextInt();
	sc.close();
	oddSeries(n);
	System.out.println();
	
		
	}
}
