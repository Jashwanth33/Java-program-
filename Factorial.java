package day11;

public class Factorial {
   static long factorial(int n) {
	long ans=1;
	for(int i=1;i<n;i++) {
		ans=ans*i;
	}
	return ans;
}
	public static void main(String kk[]) {
		for(int i=1;i<21;i++) {
			System.out.println(factorial(i));
		}

}
}
