package day23;

public class Array_pass {
	public static void main(String[] args) {
		int data[]= {11,22,33};
		fx(data);
		for(int i=0;i<data.length;i++) {
			System.out.printf("%d ",data[i]);
		}
	}
		static int[] fx(int a[]){
			for(int i=0;i<a.length;i++) {
				a[i]*=2;

			}
			return a;
			
		}

		
	}
