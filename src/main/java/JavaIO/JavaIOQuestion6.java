package main.java.JavaIO;
import java.io.FileWriter;

public class JavaIOQuestion6 {
    public static void main(String args[]){
        try{
            FileWriter fw=new FileWriter("V:\\testout.txt");
            fw.write("Welcome to javaLanguage.");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success...");
    }
}
