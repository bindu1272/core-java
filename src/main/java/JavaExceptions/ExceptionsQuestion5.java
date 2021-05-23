package main.java.JavaExceptions;
public class ExceptionsQuestion5 {
    public static void main(String args[]){
        int num = 15;
        try {
            if (num < 18){
                throw new Exception("age is not suffienct");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }

}
