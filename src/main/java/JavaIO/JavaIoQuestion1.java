package main.java.JavaIO;
import java.io.*;

public class JavaIoQuestion1 {
        public static void main(String args[]){
            try{
                FileInputStream fin=new FileInputStream("V:\\testout.txt");
                int i=0;
                while((i=fin.read())!=-1){
                    System.out.print((char)i);
                }
                fin.close();
            }catch(Exception e){System.out.println(e);}
        }
}


