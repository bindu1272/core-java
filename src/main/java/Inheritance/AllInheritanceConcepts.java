package main.java.Inheritance;
class A{
    public void firstMethod(){
        System.out.println("Iam in A class");
    }
    public void commonMethod(){
        System.out.println("common method in A class");
    }
    int a = 10;
}
class B extends  A{
    int a = 20;
    public void secondMethod(){
        System.out.println("Iam in B class");
    }
    public void commonMethod(){
        System.out.println("common method in B class");
    }

}
class C extends B{
    int a = 30;
    public void thirdMethod(){
        System.out.println("Iam in C class");
    }
    public void commonMethod(){
        System.out.println("common method in C class");
    }
}

public class AllInheritanceConcepts {
    public static  void main(String args[]){
        A a = new A();
        B b = new B();
        C c = new C();
        a.commonMethod();
        b.commonMethod();
        c.commonMethod();
        a.firstMethod();
        b.secondMethod();
        c.thirdMethod();
        a.firstMethod();
        b.firstMethod();
        c.firstMethod();
        A p = new B();
        p.firstMethod();
        System.out.println(a.a);
        System.out.println(c.a);
        System.out.println(p.a);
    }
}
