package day31;

// Java program to print Preorder traversal from given
// Inorder and Postorder traversals.

import java.util.*;

public class ConvertToInorder {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    static class GfG {

        // A utility function to search data in in[]
        static int search(List<Integer> in, int data, int n) {
            for (int i = 0; i < n; i++)
                if (in.get(i) == data)
                    return i;
            return -1;
        }

        // Fills preorder traversal of tree with given
        // inorder and postorder traversals in a stack
        static void fillPre(List<Integer> in, List<Integer> post, int inStrt,
                             int inEnd, Stack<Integer> s, int n, int[] postIndex) {
            if (inStrt > inEnd)
                return;

            // Find index of next item in postorder traversal in inorder.
            int val = post.get(postIndex[0]);
            int inIndex = search(in, val, n);
            postIndex[0]--;

            // traverse right tree
            fillPre(in, post, inIndex + 1, inEnd, s, n, postIndex);

            // traverse left tree
            fillPre(in, post, inStrt, inIndex - 1, s, n, postIndex);

            s.push(val);
        }

        // This function basically initializes postIndex as last element index,
        // then fills stack with reverse preorder traversal using fillPre
        static List<Integer> getPreorderTraversal(List<Integer> in, List<Integer> post, int n) {
            int postIndex = n - 1;
            Stack<Integer> s = new Stack<>();
            fillPre(in, post, 0, n - 1, s, n, new int[]{postIndex});

            List<Integer> result = new ArrayList<>();
            while (!s.isEmpty()) {
                result.add(s.pop());
            }
            return result;
        }
    }

    public static void main(String[] args) {
        List<Integer> in = Arrays.asList(4, 2, 5, 1, 3, 6);
        List<Integer> post = Arrays.asList(4, 5, 2, 6, 3, 1);
        int n = in.size();

        List<Integer> result = GfG.getPreorderTraversal(in, post, n);

        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}
