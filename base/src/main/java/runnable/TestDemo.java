package runnable;

/**
 * Created by alibeibei on 2017/12/1.
 */
public class TestDemo implements Runnable {
    public String name;
    Thread thread;

    public TestDemo(String threadName) {
        this.name = threadName;
        thread = new Thread(this, threadName);
        System.out.println("New thread:" + thread);
        thread.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println(name + ":" + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(name + ":error");
        }
        System.out.println(name + ":exit");
    }

    public static void main(String[] args) {
        new TestDemo("one");
        new TestDemo("tow");
        new TestDemo("three");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("main error");
        }
        System.out.println("main exit");
    }
}
