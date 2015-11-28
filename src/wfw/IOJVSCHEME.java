package wfw;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IT_School on 22.11.2015.
 */
public class IOJVSCHEME {
    public static void main(String[] args) {
        try{
            FileWriter out = new FileWriter("D:/lesson/untitled876/src/io/as");
            BufferedWriter br = new BufferedWriter(out);
            PrintWriter pw= new PrintWriter(br);
            pw.print("Iam a sentence in a text file");
            pw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
