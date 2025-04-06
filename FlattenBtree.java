package day31;

// Java program to flatten a given Binary Tree into linked list
public class FlattenBtree {

    // A binary tree node
    static class FNode {
        int data;
        FNode left, right;

        FNode(int key) {
            data = key;
            left = right = null;
        }
    }

    static class BinaryTre {

        FNode root;

        // Function to convert binary tree into linked list by
        // altering the right node and making left node NULL
        public void flatten(FNode node) {
            // Base case - return if root is NULL
            if (node == null)
                return;
            // Or if it is a leaf node
            if (node.left == null && node.right == null)
                return;
            // If root.left children exists then we have to make
            // it node.right (where node is root)
            if (node.left != null) {
                // Move left recursively
                flatten(node.left);
                // Store the node.right in Node named tempNode
                FNode tempNode = node.right;
                node.right = node.left;
                node.left = null;
                // Find the position to insert the stored value
                FNode curr = node.right;
                while (curr.right != null)
                    curr = curr.right;
                // Insert the stored value
                curr.right = tempNode;
            }
            // Now call the same function for node.right
            flatten(node.right);
        }

        // Function for Inorder traversal
        public void inOrder(FNode node) {
            // Base Condition
            if (node == null)
                return;
            inOrder(node.left);
            System.out.print(node.data + " ");
            inOrder(node.right);
        }

        // Driver code
        public static void main(String[] args) {
            BinaryTre tree = new BinaryTre();

            /*
             * 1 / \ 2 5 / \ \ 3 4 6
             */

            tree.root = new FNode(1);
            tree.root.left = new FNode(2);
            tree.root.right = new FNode(5);
            tree.root.left.left = new FNode(3);
            tree.root.left.right = new FNode(4);
            tree.root.right.right = new FNode(6);

            System.out.println(
                    "The Inorder traversal after flattening binary tree ");
            tree.flatten(tree.root);
            tree.inOrder(tree.root);
        }
    }

    // This code is contributed by Aditya Kumar (adityakumar129)
}
