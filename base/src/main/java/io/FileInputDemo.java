package io;

import java.io.*;

/**
 * Created by alibeibei on 2017/12/5.
 */
public class FileInputDemo {

    /**
     * 字节读取
     */
    public static void test() {
        FileInputStream fin = null;
        try {
            File file = new File("D:\\wwwroot\\javaHome\\javaStudy\\base\\src\\main\\java\\io\\test.txt");
            fin = new FileInputStream(file);
            byte b[] = new byte[(int) file.length()];
            fin.read(b);
            System.out.println(new String(b));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fin != null) {
                try {
                    fin.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /**
     * 按行读取
     */
    public static void test1() {
        BufferedReader br = null;
        String path = "D:\\wwwroot\\javaHome\\javaStudy\\base\\src\\main\\java\\io\\test.txt";
        try {
            br = new BufferedReader(new FileReader(path));
            String str = null;
            StringBuffer sb = new StringBuffer("");
            while ((str = br.readLine()) != null) {
                sb.append(str + "\n");
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("test()");
        test();
        System.out.println("test1()");
        test1();
    }
}
