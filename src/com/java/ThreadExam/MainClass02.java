package ThreadExam;

public class MainClass02 {
    public static void main(String[] args) {
        TestThread testTH = new TestThread();
        Thread th0 = new Thread(testTH, "첫 번째 스레드");
        Thread th1 = new Thread(testTH, "두 번째 스레드");
        
        th0.start();
        th1.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("메인 클래스");
    }
}
