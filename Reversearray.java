package day11;

public class Reversearray {
	    public static void main(String[] args) {
	        int[] array = {1, 2, 3, 4, 5};
	        reverseArray(array);
	        for (int i : array) {
	            System.out.print(i + " ");
	        }
	    }
	    public static void reverseArray(int[] arr) {
	        int start = 0;
	        int end = arr.length - 1;
	        int temp;
	        
	        while (start < end) {
	            temp = arr[start];
	            arr[start] = arr[end];
	            arr[end] = temp;
	            start++;
	            end--;
	        }
	    }
	}

