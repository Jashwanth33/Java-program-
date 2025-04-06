package day31;

public class linkedlist {
	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}
	public Node insertpos(int key,int pos,Node head) {
		Node newnode=new Node(key);
		if(pos==1) {newnode.next=head;head=newnode;}
		else {
			Node newnode1=head;
			for(int i=1;newnode1!=null&&i<pos-1;i++) {
				newnode1=newnode1.next;
				if(newnode1==null)
				{
					System.out.println("out of bound"); return head;}
			return head;
		}
	}
		return newnode;
	}
	
	public void print(Node head) {
		Node newnode=head;
		int c=0;
		while(newnode!=null) {
			System.out.println(newnode.data+" ");
			newnode=newnode.next;
			c++;
		}
		System.out.println("no.of nodes:"+c);
	}
	

	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		Node head=null;
		System.out.println("Inserting 10 at postion 1");
		head=list.insertpos(10,1,head);
		
		list.print(head);
		

	}

}
