package day31;
import java.util.*;
class MyStack{
	int size=5;
	int data[]=new int[size];
	int top=-1;
	boolean push(int add) {
		if(top == size-1) {
			System.out.println("stack is full");
			return false;
	}
		else {
			top++;
			data[top]=add;
		}
		return true;
	}
	int pop() {
		if(top==-1) {
			System.out.println("stack is empty");
		return -111;}
		else {
			int add=data[top];
			top--;
			return add;
		}
	}
	void printStack()
	{
		for(int k: data)
			System.out.println(k);
	}
	boolean isEmpty() {
		if(top==-1) {
			return true;
	}
	return false;
}
}
public class Mystack {

	public static void main(String[] args) {
		MyStack stack=new MyStack();
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		stack.push(50);
		stack.push(60);
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		stack.pop();
		int ans=stack.pop();
		System.out.println(ans);
		

	}
}