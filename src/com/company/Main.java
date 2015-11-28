package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        try( DataOutputStream dout = new DataOutputStream(new FileOutputStream("Test.dat"))){
            dout.writeDouble(98.6);
            dout.writeInt(123);
            dout.writeBoolean(true);}
        catch (FileNotFoundException e){
            System.out.println("Cannot Open Output");
            return;
        }catch (IOException e){
            System.out.println("I/O Ero "+e);
        }

try (DataInputStream din = new DataInputStream(new FileInputStream("Test.dat"))){
    double d = din.readDouble();

    int i = din.readInt();
    boolean b = din.readBoolean();
    System.out.println("Gere are the values "+b+" "+i+" "+d);
} catch (FileNotFoundException e){
    System.out.println("Cannot Open Output");
    return;
}catch (IOException e){
    System.out.println("I/O Ero "+e);
}
    }
}
