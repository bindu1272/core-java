package main.java.ThisAndSuperKey;
//this() used for methods not in constructors
class E{
    void m(){
        System.out.println("hi");
    }
    void n(){
        System.out.println("hello");
        this.m();
    }

}

public class ThisAndSuperQuestion6_2 {
    public static void  main(String args[]){
        E e = new E();
        e.n();
    }
}
