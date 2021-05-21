package main.java.Interfaces;
interface  A{
    public void clean();
}
interface B{
    public void sweep();
}
class  C implements A,B{
    public void clean(){
        System.out.println("clean method");
    }
    public void sweep(){
        System.out.println("sweep method");
    }
}

public class InterfaceQuestion4 {
    public static void main(String args[]) {
        C c = new C();
        c.clean();
        c.sweep();
    }

}
