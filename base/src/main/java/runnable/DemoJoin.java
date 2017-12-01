package runnable;

/**
 * Created by alibeibei on 2017/12/1.
 */
public class DemoJoin implements Runnable {
    public String name;
    public Thread thread;

    public DemoJoin(String threadName) {
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
        DemoJoin obj1 = new DemoJoin("one");
        DemoJoin obj2 = new DemoJoin("two");
        DemoJoin obj3 = new DemoJoin("three");
        System.out.println("obj1=" + obj1.thread.isAlive());
        System.out.println("obj2=" + obj2.thread.isAlive());
        System.out.println("obj3=" + obj3.thread.isAlive());
        obj1.thread.setPriority(5);
        obj2.thread.setPriority(5);
        obj3.thread.setPriority(5);
        try {
            obj1.thread.join();
            obj2.thread.join();
            obj3.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main exit");
    }

}
