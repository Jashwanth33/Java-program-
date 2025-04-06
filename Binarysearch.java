package day15;

import java.util.Arrays;

public class Binarysearch {
	static int binarySearch(int n,int a[])
	{ 

		int mid=0; 
	boolean found=false;
	int left=0;
	int right=a.length-1;
	Arrays.sort(a);
	while(!found && left <right) {
		mid=(left+right)/2;
		if(a[mid]==n) {
			found =true;
		return mid;
		}
		if(a[mid]<n)
			left=mid+1;
		else
			right=mid-1;
		
	}
	return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int ans=binarySearch(11,new int [] {10,20,30,11,66,77,88});
 
         if(ans==-1)System.out.println("not found");
         else {
        	 System.out.println("found");
         System.out.println("pos =" +ans);
}
	}
}
