package ExecutersCallables;
import com.sun.security.jgss.GSSUtil;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ArrayList<Future<String>> AllThreadPromises = new ArrayList<>();


        ExecutorService es = Executors.newFixedThreadPool(100);

        for (int i = 1; i <= 100; i++) {
            Burger B = new Burger();
            Future<String> ThreadPromise = es.submit(B);
            AllThreadPromises.add(ThreadPromise);
        }

        for (Future<String> promise : AllThreadPromises) {
            String result = promise.get();
            System.out.println(result);
        }

    es.shutdown();
    }
}
