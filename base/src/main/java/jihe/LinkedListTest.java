package jihe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * Created by alibeibei on 2017/12/14.
 */
public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("A");
        ll.add("A");
        ll.add("A");
        ll.add("A");
        ll.add("C");
        ll.add(1, "B");
        ll.pollFirst();
        ll.removeFirst();
        ll.removeLast();
        Iterator<String> iterator = ll.iterator();
        while (iterator.hasNext()) {
            System.out.println("it=" + iterator.next());
        }
        ListIterator<String> iterator1 = ll.listIterator();
        System.out.println(iterator1.hasPrevious());
        while (iterator1.hasPrevious()) {
            System.out.println("listit=" + iterator1.previous());
        }
        for (String string : ll) {
            System.out.println(string);
        }
        System.out.println(ll.toString());
    }
}
