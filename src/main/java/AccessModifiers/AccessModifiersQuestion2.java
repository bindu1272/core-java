package main.java.AccessModifiers;
class B{
    int a = 20;
    void msg(){
        System.out.println("try it");
    }
}
class AccessModifiersQuestion2 extends A{
     void msg(){
        System.out.println("trying to access the overriden method");
    }
    public static void main(String args[]){
        AccessModifiersQuestion2 p = new AccessModifiersQuestion2();
        p.msg();
        B b = new B();
        System.out.println(b.a);
        b.msg();
    }
}

