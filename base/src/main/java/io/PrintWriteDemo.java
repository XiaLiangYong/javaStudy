package io;

import java.io.PrintWriter;

/**
 * Created by alibeibei on 2017/12/5.
 */
public class PrintWriteDemo {
    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        pw.println("println");
        int i = -7;
        pw.println(i);
        double d = 4.5e-7;
        pw.println(d);
    }
}
