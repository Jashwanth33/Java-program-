package day24;
import java.util.*;
public class MatrixTrans {
	public static void main(String[] args) {
		
	int a[][]= {{1,2,3},{4,5,6},{9,8,7}};
	int b[][]= {{1,1,1},{1,1,1},{1,1,1}};
	int c[][]=new int[3][3];
	int d[][]=new int[3][3];
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j][i]+" ");
		}
		System.out.println();
		
	}
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(i==j) {
				System.out.println(a[i][j]);
			}
		}
	}
	//lower triangle
	System.out.println("lower triangle");
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<=i;j++) {
			System.out.print(a[i][j]+" ");
	}
	System.out.println();
	}
	//upper triangle triangle
		System.out.println("upper triangle");
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				System.out.print(a[i][j]+" ");
		}
		System.out.println();
		}
	}

}
