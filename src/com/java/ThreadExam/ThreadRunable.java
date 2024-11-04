package ThreadExam;

public class ThreadRunable implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("Runable Thread Test");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try{
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
