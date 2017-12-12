package str;

import java.util.List;

/**
 * Created by alibeibei on 2017/12/12.
 */
public class Test {

    public void testEquals() {
        String s1 = "Hello";
        String s2 = new String(s1);
        String s3 = s1;
        System.out.println(s1 + " equals " + s2 + "->" + s1.equals(s2));
        System.out.println(s1 + " ==  " + s2 + "->" + (s1 == s2));
        System.out.println(s1 + " ==  " + s3 + "->" + (s1 == s3));
    }

    public static void main(String[] args) {
        char chars[] = {'a', 'b', 'c', 'd', 'e'};
        String str = new String(chars);
        System.out.println("str=" + str);
        System.out.println(new String(chars, 1, chars.length - 1));
        System.out.println(("1" + "2").length());

        int age = 9;
        float f = 12.1f;

        System.out.println(str + age + f);
        System.out.println(2 + 2);
        System.out.println("f" + 2 + 2);

        Box box = new Box();
        box.setHeight(1d);
        box.setWidth(2d);
        box.setDepth(2d);
        System.out.println(box);
        System.out.println("abc".charAt(2));
        String s = "This is a demo of the getchars method";
        char buf[] = new char[4];
        s.getChars(10, 14, buf, 0);
        System.out.println(buf);
        System.out.println(s.getBytes().toString());

        System.out.println("AaBz".equalsIgnoreCase("aabz"));
        System.out.println("aabz".equals("aabz"));

        String test = "bcAa";
        System.out.println(test.regionMatches(2, "Aa", 0, 2));
        System.out.println(test.regionMatches(true, 2, "aa", 0, 2));
        System.out.println(test.startsWith("a"));
        System.out.println(test.endsWith("a"));
        System.out.println(test.startsWith("a", 3));
        Test test1 = new Test();
        test1.testEquals();

        String s4 = "   https://www.baidu.com?nihaosai?:111   ";
        System.out.println(s4.indexOf(":", 6));
        System.out.println(s4.lastIndexOf("?"));
        System.out.println(s4.substring(s4.indexOf("?") + 1, s4.length()));

        System.out.println(s4.concat("hello"));
        System.out.println(s4.replace("h", "w"));
        System.out.println(s4.trim());
        long[] arr = new long[]{2, 3, 4};
        System.out.println(String.join(":", "nihao", "hellop"));
        String demo = "f=8&rsv_bp=0&rsv_idx=1&tn=baidu&wd=docker&rsv_pq=e054438600046779&rsv_t=52f0ZKqrHgYB1cutZawf5ChQalq8RjlhOahLR9nezLxfqzbmpxdVidEepiE&rqlang=cn&rsv_enter=1&rsv_sug3=6&rsv_sug1=5&rsv_sug7=100";
        String[] list = demo.split("&");
        for (String i : list) {
            System.out.println(i);
        }
    }
}
