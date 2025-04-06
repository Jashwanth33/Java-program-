package day_12;
import java.util.*;

public class NoOfTyres {

    int findValue(int n, int[] a, int[] b) {
        int sum = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            sum += a[i] * 4;
            m += b[i] * 2;
        }
        return sum + m;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
   
        int n = sc.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[n];

 
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }

        NoOfTyres obj = new NoOfTyres();
        int ans = obj.findValue(n, a, b);
        System.out.println( ans);
    }
}
