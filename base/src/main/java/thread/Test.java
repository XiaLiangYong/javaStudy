package thread;

/**
 * Created by alibeibei on 2017/12/1.
 */
public class Test extends Thread {

    @Override
    public void run() {
        super.run();
        Thread t = new Thread();
        System.out.println("hello=" + t.getName());
    }

    public static void main(String[] args) {

    }
}
