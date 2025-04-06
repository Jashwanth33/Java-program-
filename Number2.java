package jpmorgan;
import java.util.*;
public class Number2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res=0;
		for(int i=0;i<=n;i++) {
			 res=2+(i-1)*10;
		}
		System.out.println(res);
		
	}

}
