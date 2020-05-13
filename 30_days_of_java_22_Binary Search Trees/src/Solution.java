import java.util.Scanner;

class Solution {

    public static int getHeight(Node root) {
        //Write your code here
        Node node = root;
        int height_left = 0;
        int height_right = 0;
        if (node.left == null && node.right == null) return 0;
        else {
            if (node.left != null) height_left = getHeight(node.left) + 1;
            if (node.right != null) height_right = getHeight(node.right) + 1;
            return Math.max(height_left, height_right);
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        int height = getHeight(root);
        System.out.println(height);
    }
}