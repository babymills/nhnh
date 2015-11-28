package wfw;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by IT_School on 22.11.2015.
 */
public class Test0 {
    public static void main(String[] args) throws IOException {
     /**   try {
            InputStream inFile = new FileInputStream("D:/lesson/untitled876/src/io/as");

            readFullyByByte(inFile);
            System.out.print("\n\n\n");
       } catch (FileNotFoundException e) {
            e.printStackTrace();}
            try{
                InputStream inUrl = new URL("http://google.com").openStream();


        readFullyByByte(inUrl);
            System.out.print("\n\n\n");}
        catch (IOException e) {
            e.printStackTrace();
        }*/
            InputStream inArray = new ByteArrayInputStream(new byte[] {65,-1, -65, -66, 67, 68, 69});
            readFullyByByte(inArray);
            System.out.print("\n\n\n");}


    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char)oneByte);
            } else {
                System.out.println("\n" + "end");
                break;
            }
        }
    }
}