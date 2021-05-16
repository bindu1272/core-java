package main.java.Arrays;
import java.util.Scanner;

public class ArraysQuestion11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of an array");
        int num = sc.nextInt();
        System.out.println("enter elements");
        int array[] = new int[num];
        int secondArray[] = new int[num];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter second Array elements");
        for(int i=0;i<num;i++){
            secondArray[i] = sc.nextInt();
        }
        System.out.println("elements in first Array :");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println("elements in second array: ");
        for(int i : secondArray){
            System.out.print(i+" ");
        }
        System.out.println("elements that are common");
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++) {
                if (array[i] == secondArray[j]) {
                    System.out.println(array[i]);
                }
            }
        }
    }
}
