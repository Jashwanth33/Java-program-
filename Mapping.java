package day31;
import java.util.*;
public class Mapping {
	public static void main(String[] args) {
		Map<Integer,Integer> map1=new HashMap<Integer,Integer>();
		map1.put(1, 200);
		map1.put(2,300);
		System.out.println("printing the entire map,row");
		for(Map.Entry<Integer,Integer> m: map1.entrySet()) {
			System.out.println(m);
		}
		int v=map1.get(1);System.out.println(v);
		v=map1.get(2);System.out.println(v);
		if(map1.containsKey(3)) {
			System.out.println("Available");
		}
		else
			System.out.println("Not Available");
	}

}
