package day23;
interface calci{
	int add(int x,int y);
	int sub(int x,int y);
	int mul(int x,int y);
	int div(int x, int y);

}
class cal implements calci{

	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public int sub(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int mul(int x, int y) {
		// TODO Auto-generated method stub
		return x*y;
	}

	@Override
	public int div(int x, int y) {
		// TODO Auto-generated method stub
		 if(y!=0)
			 return x/y;
		 return 0;
	}
	
}
public class InstanceDemo {
	public static void main(String[] args) {
		calci if1=new cal();
		System.out.println(if1.add(100, 988));
		System.out.println(if1.sub(500, 878));
		System.out.println(if1.mul(100, 988));
		System.out.println(if1.div(100, 0));
	}

}
