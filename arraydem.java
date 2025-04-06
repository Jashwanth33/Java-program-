package day19;

public class arraydem {
	static int[] doOperations(int data[],int x, char op)
	{
		if(op=='+') {
			for(int i=0;i<data.length;i++) {
				data[i]=data[i]+x;
			}
		}
		if(op=='-') {
			for(int i=0;i<data.length;i++) {
				data[i]=data[i]-x;
			}
		}
		if(op=='*') {
			for(int i=0;i<data.length;i++) {
				data[i]=data[i]*x;
			}
		}
		if(op=='/') {
			for(int i=0;i<data.length;i++) {
				try {
				data[i]=data[i]/x;
			}
				catch(Exception e) {
					e.printStackTrace();
					return null;
				}
		}
		
	}return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char op='+';
        int x=0;
        int data[]= {10,20,30,89,-1};
        int min=Integer.MAX_VALUE;
        for(int i=0;i<data.length;i++)
        {
        	min=Math.min(min, data[i]);
        }
        System.out.println(min);
        data=doOperations(data,x,op);
        for(int i=0;i<data.length;i++)
        {
        	System.out.println(data[i]);
        }
         op='-';
        data=doOperations(data,x,op);
        for(int i=0;i<data.length;i++)
        {
        	System.out.println(data[i]);
        }
        op='*';
        data=doOperations(data,x,op);
        for(int i=0;i<data.length;i++)
        {
        	System.out.println(data[i]);
        }
        op='/';
        
        data=doOperations(data,x,op);
        if(data==null) {
        	System.out.println("something went wrong");
        }
        else {
        for(int i=0;i<data.length;i++)
        {
        	System.out.println(data[i]);
        }
        }
	}

}
