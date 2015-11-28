package com.company;

import java.io.*;

/**
 * Created by IT_School on 28.11.2015.
 */
public class DemoSer {
    public static void main(String[] args) {
        Student goncharenko = new Student("Gon",1,"sf4f");
        System.out.println(goncharenko);
        File fw = new File("D:/lesson/untitled876/src/io/as");
        try{
        ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
        ostream.writeObject(goncharenko);
        ostream.close();}
    catch(IOException e){
        System.err.println(e);
        Student.faculty = "sdsvddvsf";
        File fr= new File("");
        try{
        ObjectInputStream istream =new ObjectInputStream(new FileInputStream(fr));

        Student unknown =(Student)istream.readObject();
        istream.close();
        System.out.println(unknown);}
        catch (ClassNotFoundException ce) {

            System.err.println(ce);

            System.err.println("Класс не существует");

        } catch (FileNotFoundException fe) {

            System.err.println(fe);

            System.err.println("Файл не найден");

        } catch (IOException ioe) {

            System.err.println(ioe);

            System.err.println("Ошибка доступа");

        }
}}}
