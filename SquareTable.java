package day12;

import java.util.Scanner;

public class SquareTable {public class Table {
	static void printsquareTable(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i*i);
			
		}
		
	}
	 public static void main(String kk[]) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 sc.close();
		 printsquareTable(n);
		 
	}

}

}
