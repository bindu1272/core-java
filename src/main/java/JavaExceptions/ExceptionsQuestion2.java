package main.java.JavaExceptions;

public class ExceptionsQuestion2 {
    public static void main(String args[]){
        int num1=5,num2= 0;
        try {
            int output = num1/num2;
            System.out.println(output);
        } catch (ArithmeticException e){
            System.out.println(e);
        }
    }
}

