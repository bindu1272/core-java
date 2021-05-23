package main.java.JavaExceptions;
import java.io.BufferedReader;
import java.io.FileReader;

public class ExceptionsQuestion11 {
    public static void main(String args[]){
        try {
            FileReader reader = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(reader);
            String data = null;
            while ((data = br.readLine()) != null) {
                System.out.println(data);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
