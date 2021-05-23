package main.java.JavaIO;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class JavaIOQuestion8 {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("V:\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java.");
        buffer.close();
        System.out.println("Success");
    }
}
