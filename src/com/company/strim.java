package com.company;

import java.io.*;

import static java.lang.System.out;

/**
 * Created by IT_School on 28.11.2015.
 */
public class strim {
    public static void main(String[] args) throws IOException {
        FileInputStream st= new FileInputStream("D:/lesson/untitled876/src/io/as");
        out.print("\n___________ Работа с _____________\n");
        while(st.available()!=0)//цикл пока есть что читать
        {
            int b=st.read();
            char ch=(char)b;
            out.print(ch);

        }
        st.close();
        FileOutputStream so= new FileOutputStream("D:/lesson/untitled876/src/io/ffffgd.text");//запись в файл
        String d="Hello";
        byte[] bytes= d.getBytes();//по битово масив
        so.write(bytes);
        so.close();

        BufferedReader reader = new BufferedReader(new FileReader("D:/lesson/untitled876/src/io/ffffgd.text"));
        String s=null;
        out.print("\n___________Работа с BufferedReader чтение по строкам_____________\n");
        while ((s=reader.readLine())!=null)
        {
            out.println(s);
        }
        reader.close();

        PrintWriter write=new PrintWriter("out1.txt");
        write.printf("%s %d %c", "Строки",100,'c');
        write.close();
    }}
