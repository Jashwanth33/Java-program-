package day16;
import java.util.*;
import java.util.HashMap;
public class ArrFreq{
	static void printFreqint (int a[]) {
		int fc=0;
		for(int i=0;i<a.length;i++)
		{
			int x=a[i];
			Map <Integer,Integer> name=new HashMap<Integer,Integer>();
			for(int j=0;j<a.length;j++){
				if(x==a[j])
					fc ++;
				name.add(fc);
			}
			System.out.println(x +"occurs" + fc);
			fc=0;
		}
		
	}
 public static void main(String kk[]) {
	 int a[]= {1,2,3,4,1,2,3,1,1,3};
	 Arrays.sort(a);
	 printFreqint(a);
 }
}