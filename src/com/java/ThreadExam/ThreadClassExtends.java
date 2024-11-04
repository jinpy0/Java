package ThreadExam;

public class ThreadClassExtends extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        System.out.println("스레드 클래스 상속 스레드");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            try{
                Thread.sleep(500); // 프로세스가 죽었다가 복귀를 해야 하므로 try , catch 문으로 묶어줌
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}
