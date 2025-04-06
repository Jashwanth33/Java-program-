package day31;
class DLLNode {
    int data;
    DLLNode next;
    DLLNode prev;
    
    DLLNode(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    DLLNode head;

    void deleteNode(int key) {
    
    	// Start from the head
        DLLNode current = head;
        
        // Find the node to be deleted
        while (current != null && current.data != key) {
            current = current.next;
        }
        
        // Node not found
        if (current == null) {
            System.out.println("Node not found");
            return;
        }
        
        // Update the next node's prev pointer
        if (current.next != null) {
            current.next.prev = current.prev;
        }
        
        // Update the prev node's next pointer
        if (current.prev != null) {
            current.prev.next = current.next;
        } else {
            // If the node to be deleted is the head
            head = current.next;
        }
        
        // Finally, delete the node
        current = null;
    }

    // Method to add nodes to the list for testing
    void push(int new_data) {
        DLLNode new_node = new DLLNode(new_data);
        new_node.next = head;
        new_node.prev = null;
        if (head != null) {
            head.prev = new_node;
        }
        head = new_node;
    }


    void printList() {
        DLLNode node = head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.push(2);
        dll.push(4);
        dll.push(8);
        dll.push(10);

        System.out.println("Original list: ");
        dll.printList();

        System.out.println("\nDeleting node with value 8");
        dll.deleteNode(8);

        System.out.println("Updated list: ");
        dll.printList();
    }
}
