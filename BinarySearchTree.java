package trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinarySearchTree {
    public TreeNode root;

     private static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null||root==p||root==q) {
            return root;
        }
        if(p.data<root.data && q.data<root.data){
           return lowestCommonAncestor(root.left,p,q);
        }
        if(p.data>root.data && q.data<root.data){
         return   lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }
    private static trees.TreeNode bfs(trees.TreeNode root) {
        if(root==null || root==null){
            return null;
        }
        Queue<trees.TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            trees.TreeNode node=queue.poll();//to remove
            System.out.print(node.data+" ");
            if(node.left!=null){
                queue.add(node.left);
            }
            if(node.right!=null){
                queue.add(node.right);
            }
        }
        return root;
    }

    public static void main(String[] args){
     BinarySearchTree trees=new BinarySearchTree();
     Scanner scan=new Scanner(System.in);

     trees.root=new TreeNode(scan.nextInt());
     trees.root.left=new TreeNode(scan.nextInt());
     trees.root.right=new TreeNode(scan.nextInt());
     trees.root.left.left=new TreeNode(scan.nextInt());
     trees.root.left.right=new TreeNode(scan.nextInt());
     trees.root.right.left=new TreeNode(scan.nextInt());
     trees.root.right.right=new TreeNode(scan.nextInt());
     trees.root.right.left.left=new TreeNode(scan.nextInt());
     trees.root.left.right.right=new TreeNode(scan.nextInt());
    TreeNode node=lowestCommonAncestor(trees.root,trees.root.left,trees.root.right);
        System.out.println(node.data);

 }


    public static class TreeNode{
        int data;
        public TreeNode left;
        TreeNode right;
  public TreeNode (int data){
      this.data=data;
  }

    }
}
