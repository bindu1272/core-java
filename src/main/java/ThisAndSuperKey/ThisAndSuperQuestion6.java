package main.java.ThisAndSuperKey;
//using super in Methods.it can differentiate the parent and child class methods if there is same method names
class Person{
    void message(){
        System.out.println("This is person class");
    }
}
class Student extends Person{
    void message(){
        System.out.println("this is child class");
    }
    void display(){
        message();
        super.message();
    }
}
public class ThisAndSuperQuestion6 {
    public static void main(String args[]){
        Student s = new Student();
        s.display();
    }
}
