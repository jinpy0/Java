package ThreadExam;

public class MainClass01 {
    public static void main(String[] args) {
        ThreadRunable thRun = new ThreadRunable();
        Thread thread = new Thread(thRun, "스레드 생성");
        thread.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("메인 클래스");
    }
}
