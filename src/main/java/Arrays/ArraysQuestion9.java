package main.java.Arrays;
import java.util.Scanner;

public class ArraysQuestion9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of an array");
        int num = sc.nextInt();
        System.out.println("enter elements");
        int array[] = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("elements are :");
        for (int i : array) {
            System.out.print(i + " ");
        }
        for (int i = 0; i < num/2; i++) {
            int temp = array[i];
            array[i] = array[num-i-1];
            array[num-i-1] = temp;
        }
        System.out.println("Reversed array: ");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}
