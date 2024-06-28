package ExecutersCallables;

import java.util.Random;
import java.util.concurrent.Callable;

public class Burger implements Callable<String> {
    Random r = new Random();
    @Override
    public String call() throws Exception {
        int num = Math.abs(r.nextInt()) % 5;

        if(num == 0){
            return "Burger is ready "+ Thread.currentThread().getName();
        } else if(num == 1){
            return "Burger is not ready " +Thread.currentThread().getName();
        } else if(num == 2){
            return "it takes 5 mins " +Thread.currentThread().getName();
        } else if(num == 3){
            return "cooking "+Thread.currentThread().getName();
        } else if(num == 4){
            return "Hola "+Thread.currentThread().getName();
        } else {
            return "No Greeting for you "+Thread.currentThread().getName();
        }

    }
}
