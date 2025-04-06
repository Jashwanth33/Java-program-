package day_12;
import java.util.*;
public class Rightshift {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the list: ");
        int n = sc.nextInt();
        System.out.print("Enter the number of positions to right shift: ");
        int m = sc.nextInt();
        
        LinkedList<Integer> linkedList = new LinkedList<>();
        
        // Taking input from the user to fill the linked list
        System.out.println("Enter the elements of the list:");
        for (int i = 0; i < n; i++) {
            linkedList.add(sc.nextInt());
        }

        // Perform right shift by m times
        for (int i = 0; i < m; i++) {
            int last = linkedList.removeLast();
            linkedList.addFirst(last);
        }

        // Print the final linked list
        System.out.println("List after right shift:");
        for (int i : linkedList) {
            System.out.println(i);
        }
    }
}