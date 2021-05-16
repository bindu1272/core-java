package main.java.Arrays;
import java.util.Scanner;

public class ArraysQuestion12 {
    public static void main(String args[]) {
        int sum = 0;
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
        int anotherArray[] = new int[num];
        int k=0;
        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                if(array[i]==array[j]){
                    continue;
                }else{
                    anotherArray[k++] = array[i];
                }
            }
        }
        for (int i : anotherArray){
            System.out.print(i+" ");
        }
    }
}
