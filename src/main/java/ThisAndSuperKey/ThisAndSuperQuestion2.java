package main.java.ThisAndSuperKey;
class  A{
    int x = 10;
    String name = "bindu";
    public  void details(){
        System.out.println("person details");
    }
}
class B extends  A{
    public void details(){
        super.details();
        System.out.println(super.name);

    }
}
public class ThisAndSuperQuestion2{
    public static void main(String args[]){
        ThisAndSuperQuestion2 thisAndSuperQuestion2 = new ThisAndSuperQuestion2();
        A b= new B();
        b.details();
    }
}
