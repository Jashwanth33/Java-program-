package day23;
abstract class Animal{
	int lifetime=-1;
	abstract void makesound();
	void describe() {
		System.out.println("this is animal class");
	}
}
class Cat extends Animal{
	@Override
	void makesound() {
		System.out.println("meow");
	}
}
class Dog extends Animal{
	@Override
	void makesound() {
		System.out.println("lol-lol");
	}
}
abstract class Bird extends Animal{
	
}

class Crows extends Bird{
	void makesound() {
		System.out.println("ka-ka");
	}
}

public class AbstractDemo { 
	public static void main(String[] args) {
	Animal a1=new Cat();
	a1.makesound();
	a1=new Dog();
	a1.makesound();
	 a1=new Crows();
	 a1.makesound();
    System.out.println(a1 instanceof Animal);
    System.out.println(a1 instanceof Dog);
    System.out.println(a1 instanceof Bird);
	}
	}

