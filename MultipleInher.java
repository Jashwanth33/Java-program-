package day23;
interface CSE{
	void x();
	int addtask(int x,int y);
	
}
interface AIML{
	void x();
	int addtask(int x,int y,int z);
	int subtask(int x,int y);
}
class student implements CSE,AIML{

	@Override
	public int subtask(int x, int y) {
		// TODO Auto-generated method stub
		return x-y;
	}

	@Override
	public int addtask(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public void x() {
		// TODO Auto-generated method stub
		System.out.println("js one()");
	}

	@Override
	public int addtask(int x, int y, int z) {
		// TODO Auto-generated method stub
		return x+y+z;
	}
	
}
public class MultipleInher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      student s1=new student();
      s1.x();
     System.out.println(s1.addtask(17,2006 ));
      System.out.println(s1.subtask(49, 90));
      System.out.println(s1.addtask(1, 8, 9));
	}

}
