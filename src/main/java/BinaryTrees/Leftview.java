package BinaryTrees;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Leftview {
    public ArrayList<Integer> solve(TreeNode A) {
        ArrayList<Integer> result = new ArrayList<>();
        TreeNode currentNode = A; /*Assigning root node to current Node */
        Queue<TreeNode> Q=new LinkedList<>();

        Q.offer(currentNode);
        while(Q.size()!=0){

            int levelsize=Q.size();



            ArrayList<Integer> P = new ArrayList<>();
            for(int i=1; i<=levelsize;i++) {
                currentNode =Q.poll();
                if(i==1){
                    result.add(currentNode.val);
                }
                if (currentNode.left != null) {

                    Q.offer(currentNode.left);
                }
                if (currentNode.right != null) {
                    Q.offer(currentNode.right);
                }
            }



        }

        return result;



    }
}
