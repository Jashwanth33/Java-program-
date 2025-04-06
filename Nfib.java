package day13;

public class Nfib {
	static int fib(int n) {
		int a=1;int b=1;
		int c=1;
		for (int i=0;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
		}
		return c;
	}
	public static void main(String a[]) {
		System.out.println(fib(5));
	}

}
