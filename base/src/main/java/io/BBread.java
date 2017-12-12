package io;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BBread {
    public static void main(String[] args) {
        char c = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        do {
            try {
                c = (char) br.read();
                System.out.println("c=" + c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (c != 'q');
    }
}
