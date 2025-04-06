package day19;
import java.util.*;
public class Spilitword {
	public static void main(String[] args) {
		String word="veltech";
		int middle=((word.length()+1)/2);
		String half=word.substring(0,middle);
		String sehalf=word.substring(middle);
		System.out.println(half);
		System.out.println(sehalf);
		
	}

}
