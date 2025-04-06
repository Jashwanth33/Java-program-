package day_12;

import java.util.Scanner;

public class SeriesNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int o = sc.nextInt();
        int ans = 0;
        
        if (n % 2 != 0) {
            ans = 7 * (n / 2);
        } else {
            ans = 6 * ((n/2) -2);
        }
        
        System.out.println(ans);
    }
}
