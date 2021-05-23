package main.java.Calculator;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {
    public int addition(int a,int b){
        return a+b;
    }
    public int subtraction(int a,int b){
        return a-b;
    }
    public int multiplication(int a,int b){
        return a*b;
    }
    public double division(int a,int b){
        return (double)a/b;
    }
    public double sine(double degrees){
        return Math.sin(degrees);
    }
    public double cos(double degrees){
        return Math.cos(degrees);
    }
    public double tangent(double degrees){
        return Math.tan(degrees);
    }
    public double log(double degrees){
        return Math.log(degrees);
    }
    public static void calculate() throws IOException {
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        int iFirstNum,iSecondNum;
        char cOperator,option;
        do {
            System.out.print("Enter firstNum or n to stop: ");
            option = br.readLine().charAt(0);
            if(option !='n') {
                iFirstNum = Integer.parseInt(String.valueOf(option));
                System.out.print("Enter Operator(+,-,*,/): ");
                cOperator = (char) (br.readLine()).charAt(0);
                System.out.print("Enter secondNum: ");
                iSecondNum = Integer.parseInt(br.readLine());
                Calculate calculate = new Calculate(iFirstNum, cOperator, iSecondNum);
                calculate.doCalculation();
                calculate.getResult();
            }
        }while (option != 'n');
    }
}
