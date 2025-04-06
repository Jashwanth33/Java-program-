package day31;

import java.util.Queue;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubStack<Integer> s1=new Stack<Integer>();
		Queue<Integer> s1=new PriorityQueue<Integer>();
		s1.add(200);
		 s1.add(400);
		 s1.remove(500);
		 //s1.push("hello");//err//compile time type safety
		 int k=s1.remove();
		 int k1=s1.remove();
		 System.out.println(k);

	}

}
