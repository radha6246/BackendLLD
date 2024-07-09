package BinaryTrees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class leveltraversal {
    public ArrayList<ArrayList<Integer>> solve(TreeNode A) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        TreeNode currentNode = A; /*Assigning root node to current Node */
        Queue<TreeNode> Q=new LinkedList<>();

        Q.offer(currentNode);
        while(Q.size()!=0){

            int levelsize=Q.size();



            ArrayList<Integer> P = new ArrayList<>();
           for(int i=0; i<levelsize;i++) {
               currentNode =Q.poll();
               P.add(currentNode.val);
               if (currentNode.left != null) {

                   Q.offer(currentNode.left);
               }
               if (currentNode.right != null) {
                   Q.offer(currentNode.right);
               }
           }
           result.add(P);


        }

        return result;



    }
}
