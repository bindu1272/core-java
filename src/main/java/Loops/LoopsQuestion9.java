package main.java.Loops;
import java.util.Scanner;

public class LoopsQuestion9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int count = 1;
        int num = sc.nextInt();
        for(int i=2;i<num/2;i++){
            if(num%i == 0){
                count ++;
            }
        }
        if(count == 1){
            System.out.println("prime");
        }else{
            System.out.println("Not a prime");
        }
    }
}
