package ThreadExam;

public class MainClass {
    public static void main(String[] args) {
        ThreadClassExtends thCE = new ThreadClassExtends();
        thCE.setName("쓰레드 생성");
        thCE.start();

        System.out.println(Thread.currentThread().getName());
        System.out.println("메인 클래스");
    }
}