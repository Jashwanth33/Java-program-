package day9;
import java.util.*;
public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int count=1;
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			int max=i;
			if(max<arr[i] ) {
				count++;
			}
					
		}
		System.out.println(count);
		

	}

}
