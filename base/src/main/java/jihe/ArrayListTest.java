package jihe;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by alibeibei on 2017/12/14.
 */
public class ArrayListTest {

    public void test() {
        List arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(1, 5);
        arrayList.remove(4);
        Integer[] ia = new Integer[arrayList.size()];
        ia = (Integer[]) arrayList.toArray(ia);
        for (Integer integer : ia) {
            System.out.println(integer);
        }

        ListIterator<Integer> listIterator = arrayList.listIterator();
        System.out.println(listIterator.hasPrevious());
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println(arrayList.toString());
    }

    public static void main(String[] args) {
        ArrayListTest arrayListTest = new ArrayListTest();
        arrayListTest.test();
    }
}
