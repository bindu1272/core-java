package main.java.JavaIO;
import java.io.FileWriter;

public class JavaIOQuestion7 {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("V:\\testout.txt");
            fw.write("Welcome to coding world.");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}
