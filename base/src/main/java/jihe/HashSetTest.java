package jihe;

import java.util.HashSet;

/**
 * Created by alibeibei on 2017/12/14.
 */
public class HashSetTest {
    public static void main(String[] args) {
        //无序
        HashSet<String> hs = new HashSet<>();
        hs.add("Aas");
        hs.add("Aas");
        hs.add("Bv1");
        hs.add("Csd");
        hs.add("Dsd2");
        hs.add("Esd4");
        hs.add("Dsd5");
        hs.add("Esd6");
        hs.add("Dsd8");
        hs.add("Esd9");
        System.out.println(hs.toString());
    }
}
