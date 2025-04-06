package day15;

public class Array_sum {
	static int findsum(int a[])
	{
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int ans=findsum(new int [] {10,20,30});
         System.out.println(ans);
	}

}
