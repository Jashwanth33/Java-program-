package jpmorgan;

import java.util.*;

public class MaxChocolates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int money = sc.nextInt();
        sc.nextLine(); 
        String chocolates = sc.nextLine(); 
        int[] costs = new int[26];
        for (int i = 0; i < 26; i++) {
            costs[i] = sc.nextInt();
        }
        System.out.println(maxChocolates(a, money, chocolates, costs));
    }

    public static int maxChocolates(int a, int money, String chocolates, int[] costs) {
        int maxCount = 0;

        
        for (char freeType : new HashSet<Character>() {
            {
                for (char ch : chocolates.toCharArray()) {
                    add(ch);
                }
            }
        }) {
            int totalCost = 0, start = 0;
            for (int end = 0; end < chocolates.length(); end++) {
                char ch = chocolates.charAt(end);
                if (ch != freeType) {
                    totalCost += costs[ch - 'a'];
                }
               
                while (totalCost > money) {
                    char startChar = chocolates.charAt(start++);
                    if (startChar != freeType) {
                        totalCost -= costs[startChar - 'a'];
                    }
                }
                maxCount = Math.max(maxCount, end - start + 1); 
            }
        }
        return maxCount;
    }
}
