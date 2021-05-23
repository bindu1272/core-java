package main.java.Calculator;
import java.io.IOException;
import java.util.Scanner;

public class UseCalculate {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        char option;
        do{
            System.out.println("1.Calculator 2.ScientificCalculator");
            System.out.print("Enter option :");
            option = sc.next().charAt(0);
            if(Integer.parseInt(String.valueOf(option)) == 1) {
                Calculator calculator = new Calculator();
                calculator.calculate();
            }else if(Integer.parseInt(String.valueOf(option)) == 2) {
                ScientificCalculator scientificCalculator = new ScientificCalculator();
                scientificCalculator.calculate();
            }else {
                System.out.print("Enter given option :");
                option = sc.next().charAt(0);
            }
        }while(option != 'n');
    }
}
