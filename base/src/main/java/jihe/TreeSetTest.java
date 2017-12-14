package jihe;

import java.util.TreeSet;

/**
 * Created by alibeibei on 2017/12/14.
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(2);
        treeSet.add(1);
        treeSet.add(0);
        treeSet.add(3);
        treeSet.add(8);
        treeSet.add(5);
        System.out.println(treeSet.toString());
        System.out.println(treeSet.subSet(0, 3));
    }
}
