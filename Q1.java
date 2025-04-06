package day31;
import java.util.*;


public class Q1 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method 
		 Stack<Integer> s1=new Stack<Integer>();
		 s1.push(200);
		 s1.push(400);
		 s1.push(500);
		 //s1.push("hello");//err//compile time type safety
		 int k=s1.pop();
		 int k1=s1.pop();
		 System.out.println(k); System.out.println(k1);
		
		

	}

}
