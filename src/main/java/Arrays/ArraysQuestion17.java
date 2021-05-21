package main.java.Arrays;
import java.util.Arrays;

public class ArraysQuestion17 {
    static boolean result(int[] array, int num1, int num2) {
        for (int number : array) {
            boolean r = number != num1 && number != num2;
            if (r) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
        int[] array = {12, 23, 23, 12, 23, 12};
        System.out.println("Original Array: "+ Arrays.toString(array));
        int num1 = 12;
        int num2 = 23;
        System.out.println("Result: "+result(array, num1, num2));
    }
}
