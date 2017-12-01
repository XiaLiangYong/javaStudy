package runnable;

/**
 * Created by alibeibei on 2017/12/1.
 */
public class B {
    synchronized void bar(A a) {
        String name = Thread.currentThread().getName();
        System.out.println("name" + "B.foo");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("B InterruptedException");
        }
        System.out.println(name + "trying to call a.last");
        a.last();
    }

    synchronized void last() {
        System.out.println("b.last");
    }
}
