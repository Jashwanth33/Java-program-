package day20;

public class PrintAllsubstring {
	public static void main(String[] args) {
		String s="PMJASHWANTH";
		System.out.println(" ");
		int c=1;
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<=s.length();j++)
			{
				System.out.println(s.substring(i,j));
				c++;
			}
		}System.out.println(c);
		
	}

}
//substring formula is (n*(n+1)/2+1);//n =s.length();
//fib series n-1+n-2.....