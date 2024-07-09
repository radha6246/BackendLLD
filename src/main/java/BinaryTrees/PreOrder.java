package  BinaryTrees;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */
import java.util.ArrayList;
import java.util.Stack;
public class PreOrder {
    public int[] preorderTraversal(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeNode primeNode = A; /*Assigning root node to current Node */
        Stack<TreeNode> Q=new Stack<>();


        result.add(primeNode.val);
        if(primeNode.left!=null) {
            {
                TreeNode currentNode = primeNode.left;
                Q.push(currentNode);

                while ((Q.size() > 0) ||currentNode != null ) {

                    while (currentNode != null ) {


                        Q.push(currentNode);
                        currentNode = currentNode.left;

                    }

                    currentNode= Q.peek();
                    Q.pop();
                    result.add(currentNode.val);
                    currentNode=currentNode.right;


                }
            }
        }
        if(primeNode.right!=null) {
            {
                TreeNode currentNode = primeNode.left;
                Q.push(currentNode);

                while ((Q.size() > 0) ||currentNode != null ) {

                    while (currentNode != null ) {


                        Q.push(currentNode);
                        currentNode = currentNode.left;

                    }

                    currentNode= Q.peek();
                    Q.pop();

                    result.add(currentNode.val);
                    currentNode=currentNode.right;


                }
            }
        }
        int[] resultas= new int[result.size()];
        for (int i=0 ; i<result.size();i++)
        {
            resultas[i]=result.get(i);
        }
        return resultas;


    }


    public static void main(String[] args) {
       buildTree P = new buildTree();
       TreeNode S= P.buildTreeFromInput();

    }

}
