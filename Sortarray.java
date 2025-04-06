package day19;

import java.util.Arrays;

public class Sortarray {
	public static void main(String[] args) {
		String fruits[]= {"mango","pomogranite","guava","orange","lemon","apple"};
		Arrays.sort(fruits);
		for(String fruit: fruits) {
			System.out.println(fruit);
		}
	}

}

