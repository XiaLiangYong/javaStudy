package jihe;

import java.util.LinkedHashSet;

/**
 * Created by alibeibei on 2017/12/14.
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet hs = new LinkedHashSet();
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
