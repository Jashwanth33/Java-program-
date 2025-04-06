package day16;

public class MaaxSubArray_kondan {
   static int findmaxSubarray(int a[])
   {
	   int max=a[0];
	   int x=a[0];
	   for (int i=1;i<a.length;i++) {
		   max=Math.max(a[i], a[i]+max);
		   x=Math.max(max, x);
	   }
	   return x;
   }
	public static void main(String[] args) {
		int a[]= {11,22,33,-44,55};
		int ans=findmaxSubarray(a);
		System.out.println(ans);

	}

}
