package main.java.AccessmodifierSub;
import main.java.AccessModifiers.AccessModifiersQuestion3;

class D extends AccessModifiersQuestion3{
    void display(){
        System.out.println("hi");
    }

}
public class ProtectedAccess extends D {
    public static void main(String args[]){
        ProtectedAccess p = new ProtectedAccess();
        System.out.println(p.age);
        System.out.println(p.name);
        p.display();
    }
}
