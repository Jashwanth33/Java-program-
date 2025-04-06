package day9;
import java.util.*;
public class FilloutZero {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]= {4,5,0,1,9,0,5,0};
	int count=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0){
			arr[count++]=arr[i];
		
		}
	}
	
		while(count<n) {
			arr[count++]=0;
		}
		for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	}
}
