package meiju;

/**
 * Created by alibeibei on 2017/12/4.
 */
public class Test {

    public static void main(String[] args) {
        Apple ap = Apple.MAC;
        if (ap == Apple.MAC_AIR) {
            System.out.println("相同");
        } else {
            System.out.println("不相同");
        }
        System.out.println("ap=" + ap);
        for (Apple a : Apple.values()) {
            System.out.println(a);
        }
        System.out.println(ap.getMsg());
        System.out.println(Apple.MAC.ordinal());
        System.out.println(Apple.MAC_AIR.ordinal());
        System.out.println(Apple.MAC.getMsg());
        System.out.println(Apple.valueOf("MAC"));
    }
}
