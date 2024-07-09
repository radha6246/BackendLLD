
package BinaryTrees;


import java.util.Scanner;


public class buildTree {



    public static TreeNode buildTreeFromInput() {
        Scanner scanner = new Scanner(System.in);
        TreeNode root = null; // Initialize the root to null

        System.out.println("Enter node values (enter -1 to finish):");
        int val = scanner.nextInt();

        while (val != -1) { // Keep taking input until -1 is entered
            root = insertNode(root, val);
            val = scanner.nextInt();
        }

        return root;

    }

    private static TreeNode insertNode(TreeNode root, int val) {
        if (val == -1) {
            return null;
        }

        if (root == null) {
            root = new TreeNode(val);
        } else if (val < root.val) {
            root.left = insertNode(root.left, val);
        } else {
            root.right = insertNode(root.right, val);
        }
        return root;
    }

    public static void main(String[] args) {

        System.out.println("Manually built tree:");
        // ... (Code for printing the tree, e.g., preorder traversal)

        TreeNode root2 = buildTreeFromInput();
        System.out.println("\nTree built from input:");
        // ... (Code for printing the tree)
    }
}
