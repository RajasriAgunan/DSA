package trees1;


import trees.BinarySearchTree;

import java.util.Scanner;
import java.util.Stack;

public class BinarySearchTreeKthsmallest {
    TreeNode root;

    public static int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while (true) {

            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            if (--k == 0) {
                return root.data;
            }
            root = root.right;
        }
    }

    public static void main(String[] args) {
        BinarySearchTreeKthsmallest trees1 = new BinarySearchTreeKthsmallest();
        Scanner scan = new Scanner(System.in);


        trees1.root=new TreeNode(scan.nextInt());
        trees1.root.left=new TreeNode(scan.nextInt());
        trees1.root.right=new TreeNode(scan.nextInt());
        trees1.root.left.left=new TreeNode(scan.nextInt());
        trees1.root.left.right=new TreeNode(scan.nextInt());
       // trees1.root.right.left=new TreeNode(scan.nextInt());
      //  trees1.root.right.right=new TreeNode(scan.nextInt());
     //   trees1.root.right.left.left=new TreeNode(scan.nextInt());
     //   trees1.root.left.right.right=new TreeNode(scan.nextInt());

        System.out.println(kthSmallest(trees1.root, 1));

    }
}

    class TreeNode {

        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;

        }
    }

