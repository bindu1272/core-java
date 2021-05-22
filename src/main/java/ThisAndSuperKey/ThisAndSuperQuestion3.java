package main.java.ThisAndSuperKey;
//Calling constructor of current class using this() and call argument constructor using this().
public class ThisAndSuperQuestion3 {
    ThisAndSuperQuestion3(){
        System.out.println("default constructor");
    }
    ThisAndSuperQuestion3(int x){
        this();
        System.out.println("construtor with one argument");
    }
    ThisAndSuperQuestion3(int x,int y){
        this(3);
        System.out.println(x);
    }


    public static void main(String args[]){
         new ThisAndSuperQuestion3(8,10);//argumented constructor.
        new ThisAndSuperQuestion3();//without Constructors.
    }
}
