package thread;

public class DemoThread  extends  Thread{

    public void run(){
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }

    }

    public static void main(String[] args) {
        DemoThread t1 = new DemoThread();
        DemoThread t2 = new DemoThread();

        t1.start();
        t2.start();
    }
}
