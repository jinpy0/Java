package ThreadExam;

public class MainClass03 {
    public static void main(String[] args) {
        TestThread t1 = new TestThread();
        TestThread t2 = new TestThread();
        
        Thread th0 = new Thread(t1, "첫 번째 스레드");
        Thread th1 = new Thread(t2, "두 번째 스레드");
        
        th0.start();
        th1.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("메인 클래스");
    }
}
