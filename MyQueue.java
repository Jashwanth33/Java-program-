package day31;
public class MyQueue {
	int size=5;
	int data[]=new int[size];
	int front=0;
	int rear=-1;
	
	boolean enQueue (int v) {
		if(rear==size-1) {
			System.out.println("Queue is full Overflow");
			return false;
		}
		else {
			rear++;
			data[rear]=v;
		} 	
	return true;	
	}
	int deQueue() {
		if(front==-1||rear<front) {
			System.out.println(" underflow");
		return -1;
		}
		else {
			int v=data[front];
			front++;
			return v;
		}
		
	}
	boolean isEmpty() {
		if(front==-1)
			return true;
		return false;
	}
	void printqueue() {
		for(int i=0;i<size;i++) {
			System.out.println( data[i]);
		}
		
	}

	public static void main(String[] args) {
		MyQueue Q =new MyQueue();
		Q.enQueue(80);
		Q.enQueue(06);
		Q.enQueue(48);
		Q.enQueue(43);
		Q.enQueue(96);
		Q.enQueue(87);
		int ans=Q.deQueue();
		int s=Q.deQueue();
		System.out.println("fifo "+ans);
		System.out.println("fifo "+s);

		

	}

}
