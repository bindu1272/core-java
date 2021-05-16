package main.java.AccessModifiers;
class A{
    private String str = "bindu";
    private void display(){
        System.out.println("try to access the private method in another class");
    }
}
public class AccessModifiersQuestion1  extends  A{
    private void display(){
        System.out.println("trying to override");
    }
    private int getSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String args[]){
        AccessModifiersQuestion1   sample = new AccessModifiersQuestion1();
        System.out.println(sample.getSum(20,30));
        sample.display();
        A a = new A();
        //System.out.println(a.str); trying to access the private variable
        //a.display(); trying to acces the private method in super class
    }

}
