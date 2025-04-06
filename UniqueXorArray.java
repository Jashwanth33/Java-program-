package day_12;

import java.util.Scanner;

public class UniqueXorArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] a = new int[n];
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }
int res=0;
for(int num:a) {
	res^=num;
}
System.out.println(res);
}
}