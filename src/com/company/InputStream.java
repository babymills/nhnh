package com.company;

import java.io.*;

/**
 * Created by IT_School on 28.11.2015.
 */
public class InputStream {
    public static void main(String[] args) throws IOException {
        Writer out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("D:/lesson/untitled876/src/io/ffffgd.text"),"UTF8"));
        out.write("sd");
        out.close();

    }
}
