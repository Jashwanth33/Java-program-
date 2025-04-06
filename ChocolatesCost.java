package jpmorgan;
import java.util.*;
import java.util.Map.Entry;;
public class ChocolatesCost {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int mney=sc.nextInt();
		String c=sc.next();
		char []d = {5,4,4,5,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
		MaxChoco(a,mney,c,d);
	}
	
	public static int MaxChoco(int a,int mney,String c,char[] d) {
	 Map<Character,Integer>cost=new HashMap<>();
	 for(int i=0;i<26;i++) {
	 cost.put((char)('a'+ i), d[i]);
	 int m=0;
	int t=0,s=0;
	HashS
	for(int free:new HashSet<>(Arrays.asList(c.toCharArray())))){
		
	}
	
	// l = 0
	for(int n=0;n<c.length();n++) {
		if(c.charAt(n)!=0)
			t+=cost.get(c.charAt(n));
		while(t>mney) {
			//t -= cost.get(l)
			//l++
		}
			m--;
		}
		
	}
	
}

}
	 