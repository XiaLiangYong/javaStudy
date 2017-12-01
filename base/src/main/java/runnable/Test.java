package runnable;

/**
 * Created by alibeibei on 2017/12/1.
 */
public class Test implements Runnable {
    Thread t;

    public Test() {
        t = new Thread(this, "test");
        System.out.println("Child thread:" + t);
        t.getName();
        t.start();
    }

    @Override
    public void run() {
        for (int i = 5; i > 0; i--) {
            System.out.println("Child thread:" + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("InterruptedException");
            }
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        for (int i = 5; i > 0; i--) {
            System.out.println("Main thread:" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("InterruptedException");
            }
        }
    }

}
