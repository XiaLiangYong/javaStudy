package runnable;

/**
 * Created by alibeibei on 2017/12/1.
 */
public class Call {

    public void call(String msg) {
        System.out.print("msg=[" + msg);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("thread error");
        }
        System.out.println("]");
    }
}
