package day15;
class NegativeBalanceException extends Exception{
	@Override
	public String toString()
	{
		return "NegativeBalanceException : bal<0";
	}
	
}
public class throwsDemo{
	public static void main(String [] args)
	{
		int bal=-50;
		try {
		if(bal<0)
			throw new NegativeBalanceException();
		else {
			System.out.println("balnce is +");
		}
	}
		catch(Exception e) {
			System.out.println("inside the catch block");
			e.printStackTrace();
			System.out.println("main ends");
			
		}
}
}