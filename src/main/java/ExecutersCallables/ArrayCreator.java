package ExecutersCallables;

import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class ArrayCreator implements Callable<ArrayList<Integer>> {
    private int count;
    private ExecutorService exs;


    public ArrayCreator(int N, ExecutorService exs){
        this.count= N;
        this.exs=exs;

    }
    public ArrayCreator(int numbertoAdd, ArrayList<Integer> T)
    {
        T.add(numbertoAdd);
    }
    @Override
    public ArrayList<Integer> call() throws Exception {
        ArrayList<Integer> ArrayNumbers= new ArrayList<Integer>();x§
        for (int i = 1; i <= count ; i++) {

            ArrayCreator AE = new ArrayCreator(i, ArrayNumbers);
            Future<ArrayList<Integer>> NumberFuture = exs.submit(AE);






        }
        return ArrayNumbers;
    }


    }




