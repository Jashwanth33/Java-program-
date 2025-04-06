package day31;

import java.util.HashMap;
import java.util.Map;

public class Mapping2 {
	public static void main(String[] args) {
		Map<String,String> map1=new HashMap<String,String>();
		map1.put("srk", "Superstar");
		map1.put("darling","prabhas");
		map1.put("srk","Superstar");
		System.out.println("Tasks");
		for(Map.Entry<String,String> m: map1.entrySet()) {
			System.out.println(m);
		}
		for(String c:map1.keySet()) {
			System.out.println(c);
		}
		for(String d:map1.values()) {
			System.out.println(d);
		}
		boolean b1=map1.containsValue("prabhas");
		boolean b2 =map1.containsKey("dkaok");
		System.out.println(b1);
		System.out.println(b2);
	

}

}
