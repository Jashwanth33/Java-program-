package day24;
abstract class Account{
	int acno;
	String name;
	float balance;
	abstract float depoist(float x);
	abstract float withdraw(float x);
	abstract float getRoi();
}
class SavingAccounts extends Account{
 
	@Override
	float withdraw(float x) {
		balance-=x;
		return balance;
	}
 
	@Override
	float depoist(float x) {
		balance+=x;
		return balance;
	}
	float getRoi() {
		return 4.0f;
	}
	
}
public class Bankapp {
public static void main(String[] args) {
	Account a1=new SavingAccounts();
	a1.depoist(500);
	float i=a1.depoist(100);
	System.out.println(i);
	float w=a1.withdraw(100);
	System.out.println(w);//with abstact we can typecast the getRoi variable
	float f= a1.getRoi();
	System.out.println(f);
}
}


