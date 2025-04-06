package day13;

public class Findvalue {
	static int findValue(int n,int a[],int b[]) {
		int c=0;
		for(int i=0;i<a.length;i++) {
			c+=4*a[i]+2*b[i];
			}
		return c;
		}
	public static void main(String[] args) {
		int ans=findValue(3,new int[] {4,4,2},new int [] {2,0,2});
		System.out.println(ans);
	}

	}
