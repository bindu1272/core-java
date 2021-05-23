package main.java.JavaExceptions;

public class ExceptionsQuestion16 {
    public static void main(String args[]){
        try {
            int a = Integer.parseInt(null);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
