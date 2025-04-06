package day13;

public class ARRdem {
	public static void main(String[] args) 
		
	 {
		int arr[]=new int[3];
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
			
		}System.out.println("After the modification");
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
		
		
	}

}
