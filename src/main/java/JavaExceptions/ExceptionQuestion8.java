package main.java.JavaExceptions;

public class ExceptionQuestion8 {
    public static void main(String args[]){
        int num1=10,num2 = 0;
        try {
            int output = 10 / 0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}
