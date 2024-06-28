package Thread;

public class HelloPrinter implements Runnable {
    @Override
    public void run() {
        System.out.println("thread in run class "+Thread.currentThread().getName());    }
    public void otherfunction(){
        System.out.println("thread on other class"+ Thread.currentThread().getName());
    }
}
