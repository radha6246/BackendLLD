package BinaryTrees;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        buildTree P = new buildTree();
        TreeNode S= P.buildTreeFromInput();
        ExecutorService es = Executors.newFixedThreadPool(5);
        TreeSizeCalculator G= new TreeSizeCalculator(S,es);
        Future<Integer> t = es.submit(G);
        System.out.println(t.get());


    }
}
