package main.java.JavaExceptions;

public class ExceptionsQuestion9 {
    public static void main(String args[]){
        int array[] = new int[5];
        try{
            System.out.println(array[6]);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
