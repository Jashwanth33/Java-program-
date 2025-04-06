package day_12;
import java.util.*;

public class IdentifyUniqueElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            frequencyMap.put(a[i], frequencyMap.getOrDefault(a[i], 0) + 1);
        }
        
 
        int uniqueElement = -1;
        for (int i = 0; i < n; i++) {
            if (frequencyMap.get(a[i]) == 1) {
                uniqueElement = a[i];
                break;
            }
        }
        
        System.out.println( uniqueElement);
    }
}
