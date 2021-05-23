package main.java.JavaExceptions;
import java.io.FileInputStream;

public class ExceptionsQuestion12 {
        public void checkFileNotFound(){
            try{
                FileInputStream in = new FileInputStream("input.txt");
                System.out.println("This is not printed");
            }catch (Exception e){
                e.printStackTrace();
            }
        }
        public static void main(String args[]){
            ExceptionsQuestion12 example = new ExceptionsQuestion12();
            example.checkFileNotFound();
        }
    }

