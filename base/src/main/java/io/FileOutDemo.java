package io;

import java.io.*;

/**
 * Created by alibeibei on 2017/12/5.
 */
public class FileOutDemo {
    public static void test() {
        String path = "D:\\wwwroot\\javaHome\\javaStudy\\base\\src\\main\\java\\io\\test.txt";
        try {
            FileOutputStream fout = new FileOutputStream(path);
            String s = "this is String which is to be out";
            byte[] b = s.getBytes();
            fout.write(b);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 带资源的try
     */
    public static void test1() {
        String path = "D:\\wwwroot\\javaHome\\javaStudy\\base\\src\\main\\java\\io\\test.txt";
        try (FileInputStream fin = new FileInputStream(path)) {

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        System.out.println("test()");
        test();
        while (true){
            test1();
            System.out.println("demo");
        }

    }
}
