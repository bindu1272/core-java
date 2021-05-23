package main.java.JavaExceptions;
import java.io.IOException;
class A{
    void m1() throws IOException {
        throw new IOException("device error");
    }
}
public class ExceptionsQuestion3 {
    public static void main(String args[]){
        A a = new A();
        //a.m1();//without try block it will show error.

        System.out.println("norma flow");
    }
}
