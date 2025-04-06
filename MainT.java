package day31;
import java.util.*;
class MerNode {
    int data;
    Node next;
    
    void Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;
    
    // Function to insert a new node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }
    
    // Function to print the linked list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    // Function to merge two sorted linked lists
    public static LinkedList mergeSortedLists(LinkedList list1, LinkedList list2) {
        LinkedList mergedList = new LinkedList();
        Node p1 = list1.head;
        Node p2 = list2.head;
        
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                mergedList.add(p1.data);
                p1 = p1.next;
            } else {
                mergedList.add(p2.data);
                p2 = p2.next;
            }
        }
        
        // Add remaining nodes of list1
        while (p1 != null) {
            mergedList.add(p1.data);
            p1 = p1.next;
        }
        
        // Add remaining nodes of list2
        while (p2 != null) {
            mergedList.add(p2.data);
            p2 = p2.next;
        }
        
        return mergedList;
    }
}

public class MainT{
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        
        // Adding elements to the first linked list
        list1.add(1);
        list1.add(3);
        list1.add(5);
        
        // Adding elements to the second linked list
        list2.add(2);
        list2.add(4);
        list2.add(6);
    }
}
