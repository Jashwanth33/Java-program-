package day12;
import java.util.Scanner;
public class Evenseries {
		static void  evenSeries(int n) {
			int c=0,m=1;
			while(c<n) {
				if(m%2==0) {
					System.out.println(m);
					c++;
				}m++;
			
			}
		}

	public static void main(String kk[]) {
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		sc.close();
		evenSeries(n);
		System.out.println();
		
			
		}
	}
