package day31;

public class ChildrenSum {
    static class CNode {
        int data;
        CNode left, right;

        CNode(int x) {
            data = x;
            left = right = null;
        }
    }

    static class Sum {

        static int isSumProperty(CNode root) {

            // If root is NULL or it's a leaf node
            // then return true
            if (root == null || (root.left == null && root.right == null))
                return 1;

            int sum = 0;

            // If left child is not present then 0
            // is used as data of left child
            if (root.left != null)
                sum += root.left.data;

            // If right child is not present then 0
            // is used as data of right child
            if (root.right != null)
                sum += root.right.data;

            // if the node and both of its children
            // satisfy the property return 1 else 0
            return ((root.data == sum)
                    && (isSumProperty(root.left) == 1)
                    && (isSumProperty(root.right) == 1)) ?
                    1 : 0;
        }

        public static void main(String[] args) {

            // Create a hard-coded tree.
            //         35
            //       /   \
            //      20    15
            //     /  \  /  \
            //   15   5 10   5
            CNode root = new CNode(35);
            root.left = new CNode(20);
            root.right = new CNode(15);
            root.left.left = new CNode(15);
            root.left.right = new CNode(5);
            root.right.left = new CNode(10);
            root.right.right = new CNode(5);

            System.out.println(isSumProperty(root));
        }
    }
}
