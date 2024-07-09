package BinaryTrees;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Inorder {
    public ArrayList<Integer> inorderTraversal(TreeNode A) {

        ArrayList<Integer> S = new ArrayList<>();
        Inorder(A,S);
        return S;
    }

    public void Inorder(TreeNode B, ArrayList<Integer> result)
    {

        while(B != null){
            Inorder(B.left,result);
            result.add(B.val);
            Inorder(B.right,result);
        }
    }



    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);

        int data= scanner.nextInt();

        TreeNode A = new TreeNode(data);
        data= scanner.nextInt();
        A.left = new TreeNode(data);
        data= scanner.nextInt();

        A.right = new TreeNode(data);

        PreOrder result = new PreOrder();
       int[] P =result.preorderTraversal(A);



    }
}


