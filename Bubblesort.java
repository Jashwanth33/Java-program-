package day19;

import java.util.Iterator;

public class Bubblesort {
	static void bubbleSort(int a[],int n) {
		int temp,i,j;
		for(i=0;i<n-1;i++) {
		boolean swap=false;
		for(j=0;j<n-i-1;j++) {
			if(a[i]>a[i+1]) {
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				swap=true;
			}
		}
		if(swap==false)
			break;
	}

}
	public static void main(String[] args) {
		
	}
}