package day16;

public class LINcresingLIST {
	static void printlist(int a[]) {
		int si=0,ei=0;
		for(int i=0;i<a.length-1;i++) {
			if(a[i]<a[i+1]) {
				ei=i+1;
			}System.out.println("si="+si);
			System.out.println("ei="+si);
			System.out.println("length="+((ei-si)+1));
			System.out.println("new seq");
		}
	}
	public static void main(String[] args) {
		printlist(new int [] {22,11,33,-1,99,0,6,4});
	}

}
