package main.java.Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysQuestion13 {
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
        Arrays.sort(array);
        System.out.println(" ");
        for(int i=array.length-2;i>=0;i--){
            if(array[i]!=array.length-3)
            System.out.print("second largest is : "+array[i]);
            break;
        }
    }
}
