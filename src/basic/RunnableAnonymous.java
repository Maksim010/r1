package basic;

public class RunnableAnonymous {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main : "+ Thread.currentThread().getName());

        Runnable runnable=new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++)
                    System.out.println("Child: "+ Thread.currentThread().getName());
                System.out.println("Child has been finished");
            }
        };
        System.out.println("creating child thread");
        Thread thread=new Thread(runnable);
        System.out.println("starting child thread");
        thread.start();

        thread.join();

        System.out.println("Main has been finished");


    }
}
