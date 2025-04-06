package day12;
import java.util.Scanner;
public class Table {
	static void printTable(int n) {
		for(int i=1;i<11;i++) {
			System.out.println(n+ "*" + i + "=" + n*i);
			
		}
		
	}
	 public static void main(String kk[]) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 sc.close();
		 printTable(n);
		 
	}

}
