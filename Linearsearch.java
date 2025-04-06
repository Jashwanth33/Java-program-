package day15;

public class Linearsearch {
	static int linearSearch(int n,int a[])
	{
		for(int i=0;i<a.length;i++) {
		if(n==a[i]) {
			return i;	
		}
		}
		return -1;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int ans=linearSearch(11,new int [] {10,20,30});
         System.out.println(ans);
	

}
}
