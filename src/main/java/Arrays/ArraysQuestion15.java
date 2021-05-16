package main.java.Arrays;
import java.util.Scanner;

public class ArraysQuestion15 {
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
        int evenCount=0,oddCount=0;
        for(int i : array){
            if(i%2==0){
                evenCount++;

            }else{
                oddCount++;
            }
        }
        System.out.println("even numbers count : "+evenCount);
        System.out.println("odd numbers count : "+oddCount);
    }
}
