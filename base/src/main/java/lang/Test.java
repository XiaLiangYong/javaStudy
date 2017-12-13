package lang;

import java.io.IOException;

/**
 * Created by alibeibei on 2017/12/13.
 */
public class Test {
    public static void main(String[] args) throws IOException {
        Double d1 = 1.1d;
        Double d2 = 2.2d;
        System.out.println(Double.sum(d1, d2));
        System.out.println(d1.isInfinite());
        System.out.println(d2.isNaN());
        System.out.println(d1.hashCode());
        Integer i = 0;
        System.out.println(Integer.SIZE);
        System.out.println(Long.SIZE);
        System.out.println(Byte.SIZE);
        System.out.println(Short.SIZE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Long.compare(1, 2));
        System.out.println(Long.compare(2, 2));
        System.out.println(Long.compare(2, 1));
        Integer j = 10000;
        System.out.println(i.compareTo(j));
        System.out.println(i.compareTo(-2));
        System.out.println(j.intValue());
        System.out.println(j.toString());
        System.out.println(Integer.reverse(10002));
        System.out.println(Integer.toHexString(10002));
        System.out.println(Integer.toBinaryString(10002));
        System.out.println(Integer.toOctalString(90029002));
        String str = "1";
        System.out.println("str=" + Integer.parseInt(str));
        System.out.println(Character.BYTES);
        System.out.println(Character.TYPE.toString().toLowerCase().toUpperCase().toLowerCase());
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isWhitespace('1'));
        System.out.println(Character.forDigit(10002, 2));
        CharSequence ch = "a,cddddd";
        int m = Character.codePointAt(ch, 1);
        System.out.println(Character.isLowSurrogate('a'));
        System.out.println(Character.isValidCodePoint(m));
        System.out.println(Void.TYPE);
        System.out.println(Void.class);
        System.out.println(Runtime.getRuntime());
        Runtime r = Runtime.getRuntime();
        System.out.println(r.totalMemory());
        System.out.println(r.freeMemory());
        System.out.println(r.exec("php -m"));
//        ProcessBuilder pb = new ProcessBuilder("notepad.exe", "C:\\Users\\alibeibei\\Desktop\\iBase4J\\iBase4J-tool\\run.cmd");
//        pb.start();
        System.out.println(System.currentTimeMillis() / 1000);
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());
    }
}
