package wfw;
import static java.lang.System.out;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by IT_School on 22.11.2015.
 */
public class laba2 {
    public static final String sourceFileName = "\"D:/lesson/untitled876/src/io/as";
    public static final String destFileNAme = "\"D:/lesson/untitled876/src/io/ffgd";

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
        PrintWriter write = new PrintWriter(destFileNAme);
        String s= null;
        int words= 0,lines=0,chars=0;
        while ((s=reader.readLine())!=null){
            lines++;
            String[] ws = s.trim().split("\\s");
            words+=ws.length;
            for (String l :ws)
                chars +=l.length();
            write.println(s.toUpperCase());
        }
    reader.close();
        write.close();
        out.printf("dfvd",chars,words,lines);
    }
}
