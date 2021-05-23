package main.java.JavaIO;
import java.io.FileReader;

public class JavaIOQuestion5 {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("V:\\testout.txt");
        int i;
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();
    }
}
