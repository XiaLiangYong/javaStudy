package str;

/**
 * Created by alibeibei on 2017/12/12.
 */
public class StringBuff {

    public void test() {
        StringBuffer sb = new StringBuffer("hellohellohellohello");
        // sb.setLength(10);
        sb.ensureCapacity(20);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        System.out.println(sb.charAt(1));
        System.out.println(sb);
        char i = 'a';
        sb.setCharAt(1, i);
        System.out.println(sb);
        System.out.println(sb.append("sb").append("sb2"));
        System.out.println(sb.insert(sb.length() - 1, "test"));
        System.out.println(sb.reverse());
        System.out.println(sb.substring(0, sb.length()));
    }


    public static void main(String[] args) {
        StringBuff test = new StringBuff();
        test.test();
    }

}
