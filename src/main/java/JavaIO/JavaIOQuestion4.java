package main.java.JavaIO;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class JavaIOQuestion4 {
    public static void main(String args[])throws Exception{
        FileOutputStream fout=new FileOutputStream("V:\\testout.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);
        String s="Welcome to javaProgramming.";
        byte b[]=s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}
