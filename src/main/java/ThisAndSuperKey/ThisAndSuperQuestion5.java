package main.java.ThisAndSuperKey;
//Call constructor of the parent class using super().
class ParentClass{
    ParentClass(){
        System.out.println("parentClass Constructor");
    }
}
class ChildClass extends ParentClass{
    ChildClass(){
        super();
        System.out.println("ChildClass Constructor");
    }
}

public class ThisAndSuperQuestion5 {
    public static void main(String args[]){
        ChildClass ch = new ChildClass();
    }
}
