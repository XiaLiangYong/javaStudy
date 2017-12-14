package jihe;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * 迭代器listIterator比较Iterator
 * Created by alibeibei on 2017/12/14.
 */
public class ListIteratorTest {
    /**
     * 一．相同点
     * 都是迭代器，当需要对集合中元素进行遍历不需要干涉其遍历过程时，这两种迭代器都可以使用。
     * 二．不同点
     * 1.使用范围不同，Iterator可以应用于所有的集合，Set、List和Map和这些集合的子类型。而ListIterator只能用于List及其子类型。
     * 2.ListIterator有add方法，可以向List中添加对象，而Iterator不能。
     * 3.ListIterator和Iterator都有hasNext()和next()方法，可以实现顺序向后遍历，但是ListIterator有hasPrevious()和previous()方法，可以实现逆向（顺序向前）遍历。Iterator不可以。
     * 4.ListIterator可以定位当前索引的位置，nextIndex()和previousIndex()可以实现。Iterator没有此功能。
     * 5.都可实现删除操作，但是ListIterator可以实现对象的修改，set()方法可以实现。Iterator仅能遍历，不能修改。
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> staff = new LinkedList<>();
        staff.add("zhuwei");
        staff.add("xuezhangbin");
        staff.add("taozhiwei");
        ListIterator<String> iter = staff.listIterator();
        String first = iter.next();

        //删除zhuwei
        iter.remove();

        //把zhuwei改为simei
        //iter.set("simei");
        System.out.println("first:" + first);

        iter.add("xiaobai");

        //遍历List元素
        System.out.println("遍历List中元素，方法一：");
        for (String str : staff) {
            System.out.println(str + "   ");
        }
        iter = staff.listIterator();
        System.out.println("遍历List中元素，方法二：");
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        System.out.println("-----逆向（顺序向前）遍历-------");
        while (iter.hasPrevious()) {
            System.out.println(iter.previous());
        }
    }

}
