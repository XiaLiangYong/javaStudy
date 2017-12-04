package zhujie;

import java.lang.reflect.Method;

/**
 * Created by alibeibei on 2017/12/4.
 */
public class Meta {
    @MyAnno(str = "你好", val = 1000)
    public static void myMeth() {
        System.out.println("myMeth");
    }

    public static void main(String[] args) {
        Meta ob = new Meta();
        try {
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth");
            ob.myMeth();
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " " + anno.val());
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}
