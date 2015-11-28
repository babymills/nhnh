package com.company;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by IT_School on 28.11.2015.
 */
public class random {
    public static final String sourceFileName= "D:/lesson/untitled876/src/io/ffgd";
    public static void main(String[] args) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(sourceFileName,"rw");
        System.out.println(raf.length());
        raf.seek(10);
        String s=raf.readLine();
       System.out.println(s);
        raf.seek(raf.length());
        raf.writeUTF("helo");
        raf.close();

    }

}
