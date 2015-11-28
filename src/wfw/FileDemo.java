package wfw;

import java.io.File;

/**
 * Created by IT_School on 22.11.2015.
 */
public class FileDemo {
    static void p(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        File f1 = new File("D:/lesson/untitled876/src/io/as");
        p("File Name: " +f1.getName());
        p("Path: " +f1.getPath());
        p("Abs PAth: " +f1.getAbsolutePath());
        p("PArent: " +f1.getParent());
        p(f1.exists()?"exists":"does not exist");
        p(f1.canWrite()?"is writeable":"is not wriateable");
        p(f1.canRead()?"is reatenble":"is no reatebl");
        p("is"+(f1.isDirectory()?"":"not"+"a directory"));
        p(f1.isFile()?"is normal file":"might be a named pipe");
        p(f1.isAbsolute()?"is absolute":"is not absolute");
        p("File last modified: "+f1.lastModified());
        p("File size: "+f1.length()+"Bytes");

    }
}
