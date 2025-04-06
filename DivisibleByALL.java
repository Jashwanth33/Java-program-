package day11;

public class DivisibleByALL {
	package day11;
	import java.util.*;

	public class divisibleByALL {

	    static int fact(int n) {
	        int factorial = 1;
	        for (int i = 1; i <= n; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }

	    static boolean isStrong(int n) {
	        int sum = 0;
	        int original = n;
	        int count=0;
	        int length=String.valueOf(original).length();
	        while (n != 0) {
	            int digit = n % 10;
	           if(original%digit==0) {
	        	   count++;
	           }
	           n=n/10;
	        }
	        return count == length ;
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	     
	        int n = sc.nextInt();
	        System.out.println(isStrong(n));
	    }
	}

