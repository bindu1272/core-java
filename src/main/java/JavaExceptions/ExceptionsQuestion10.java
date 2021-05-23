package main.java.JavaExceptions;

public class ExceptionsQuestion10 {
    public static void main(String args[]){
        try{
            Class.forName("Hi");
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
