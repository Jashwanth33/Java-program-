package jpmorgan;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
public class JacksEnglish {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
	    List<String> y=new LinkedList<>();
	     for(String m:s.split(" ")) {
	    	 if(!y.contains(m)) {
	    	 y.add(m);
	    	 }
	    	 
	}
	     System.out.println(y);
	}
}
