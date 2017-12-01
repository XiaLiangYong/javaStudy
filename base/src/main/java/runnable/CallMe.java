package runnable;

/**
 * Created by alibeibei on 2017/12/1.
 */
public class CallMe implements Runnable {
    public String msg;
    public Call target;
    public Thread t;

    CallMe(Call target, String msg) {
        this.msg = msg;
        t = new Thread(this);
        this.target = target;
        t.start();
    }

    @Override
    public void run() {
        synchronized (target) {
            target.call(msg);
        }
    }

    /**
     * 同步 多个线程访问共享资源
     * synchronized (target) {
     * target.call(msg);
     * }
     * 或者
     * public synchronized void call(String msg)
     *
     * @param args
     */
    public static void main(String[] args) {
        Call call = new Call();
        CallMe obj1 = new CallMe(call, "one");
        CallMe obj2 = new CallMe(call, "two");
        CallMe obj3 = new CallMe(call, "three");
        try {
            obj1.t.join();
            obj2.t.join();
            obj3.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main exit");
    }
}
