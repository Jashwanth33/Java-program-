package day15;

public class Array_makeEqual {
	static int makeequal(int a[]) {
		int count=0;
		int min=Integer.MAX_VALUE;
		for(int i=0;i<a.length;i++) {
			if(min>a[i])
				min=a[i];
		}
		for(int i=0;i<a.length;i++) {
			int n=a[i];
			count=count+Math.abs(a[i]-min);
			
		}
		return count;
		
		
	}

	public static void main(String[] args) {
		int ans=makeequal(new int [] {10,20,30});
		System.out.println(ans);
		}

	}

