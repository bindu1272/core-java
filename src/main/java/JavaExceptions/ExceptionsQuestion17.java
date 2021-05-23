package main.java.JavaExceptions;

public class ExceptionsQuestion17 {
    public static void main(String args[]){
        try {
            String str = "hi this is bindu";
            str.charAt(30);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
