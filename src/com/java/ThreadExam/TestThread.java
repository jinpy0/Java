package ThreadExam;

public class TestThread implements Runnable {
    int testNum = 0;

    @Override
    public synchronized void run() { // synchronized : 실행이 될 때 끝날 때 까지 다른 스레드를 사용하지 못하게 막음
        for (int i = 0; i < 10; i++) {
            if(Thread.currentThread().getName().equals("첫 번째 스레드")){
                System.out.println("==========");
                testNum++;
            }
            System.out.println("스레드 이름 : " + Thread.currentThread().getName() + ", 테스트 숫자 : " + testNum);
            try{
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e.getMessage());;
            }
        }
    }
}
