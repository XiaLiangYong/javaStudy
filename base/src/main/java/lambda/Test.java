package lambda;


import java.util.function.DoubleSupplier;

/**
 * Created by alibeibei on 2017/12/6.
 */
public class Test {
    public static void main(String[] args) {
        DoubleSupplier doubleSupplier = () -> 121212;
        System.out.println(doubleSupplier.getAsDouble());

        String str2 = "测试";
        Demo demo;
        demo = (str) -> {
            return str2;
        };
        System.out.println(demo.demo("你好"));
    }
}

