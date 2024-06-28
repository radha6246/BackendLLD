package Thread;

public class Client {
    public static void main(String[] args) {
        System.out.println("Thread "+ Thread.currentThread().getName());
        HelloPrinter H1= new HelloPrinter();

       // H1.run();

        Thread T = new Thread(H1);

    }
}
