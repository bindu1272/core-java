package main.java.Calculator;
import main.java.Calculator.Calculate;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ScientificCalculator {
    public static void calculate() throws IOException {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        double dblNum;
        char cOperator, option;
        String input;
        do {
            System.out.print("Enter firstNum or n to stop: ");
            input = br.readLine();
            option = input.charAt(0);
            if (option != 'n') {
                dblNum = Double.parseDouble(input);
                System.out.print("Enter Operator (sine-s,cos-s,tan-t,log-l): ");
                cOperator = (char) (br.readLine()).charAt(0);
                Calculate calculate = new Calculate(dblNum, cOperator);
                calculate.doCalculation();
                calculate.getResult();
            }
        } while (option != 'n');
    }
}
