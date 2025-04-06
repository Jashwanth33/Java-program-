package day12;
import java.util.Scanner;
public class Cubetable {
	static void printcubeTable(int n) {
		for(int i=1;i<=n;i++) {
			System.out.println(i*i*i);
			
		}
		
	}
	 public static void main(String kk[]) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
		 sc.close();
		 printcubeTable(n);

}
}
