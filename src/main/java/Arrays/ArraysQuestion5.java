package main.java.Arrays;
import java.util.Scanner;

public class ArraysQuestion5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Size of an array");
        int num = sc.nextInt();
        System.out.println("enter elements");
        int array[] = new int[num];
        int anotherArray[] = new int[num-1];
        for (int i = 0; i < num; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("enter the key element");
        int key = sc.nextInt();
        int j = 0;
        System.out.println("After deleting the key");
        for(int i: array){
            if(i==key){
                continue;
            }else{
                anotherArray[j++] = i;
            }
        }
        for(int i : anotherArray){
            System.out.println(i+" ");
        }
    }

}
