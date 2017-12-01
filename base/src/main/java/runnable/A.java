package runnable;

/**
 * Created by alibeibei on 2017/12/1.
 */
public class A {

    synchronized void foo(B b) {
        String name = Thread.currentThread().getName();
        System.out.println("name" + "A.foo");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("A InterruptedException");
        }
        System.out.println(name + "trying to call b.last");
        b.last();
    }

    synchronized void last() {
        System.out.println("a.last");
    }
}
