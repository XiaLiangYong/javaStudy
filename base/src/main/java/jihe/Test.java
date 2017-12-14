package jihe;


import java.util.*;

/**
 * Created by alibeibei on 2017/12/14.
 */
public class Test {
    public void setTest() {
        Set set = new HashSet();
        set.add(4);
        set.add(2);
        set.add(2);
        set.add(1);
        System.out.println(set.toString());
    }

    public void arrayDequeTest() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(1);
        arrayDeque.addLast(2);
        arrayDeque.addLast(2);
        arrayDeque.addLast(3);
        arrayDeque.add(5);
        arrayDeque.addFirst(4);
        System.out.println(arrayDeque.toString());
        System.out.println(arrayDeque.pop());
        System.out.println(arrayDeque.toString());
        System.out.println(arrayDeque.pollLast());
        System.out.println(arrayDeque.toString());
    }

    public void linkedListTest() {
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.pollFirst();
        System.out.println(linkedList.toString());
    }

    public void hashSetTest() {
        HashSet hashSet = new HashSet();
        hashSet.add(12);
        hashSet.add(12);
        hashSet.add(12);
        hashSet.add(12);
        hashSet.add(12);
        hashSet.add(13);
        hashSet.add(1);
        System.out.println(hashSet.toString());
    }

    public void linkedHashSetTest() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        System.out.println(linkedHashSet.toString());
    }

    public void treeSetTest() {
        TreeSet treeSet = new TreeSet();
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(3);
        treeSet.add(2);
        System.out.println(treeSet.toString());
    }


    public static void main(String[] args) {
        Test test = new Test();
        test.treeSetTest();
    }
}
