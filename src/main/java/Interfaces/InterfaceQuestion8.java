package main.java.Interfaces;
interface  D{
    public void clean();
    int a = 10;
}
interface E{
    public void sweep();
}
class  F implements D,E{
    public void clean(){
        System.out.println("clean method");
    }
    public void sweep(){
        System.out.println("sweep method");
    }
}
public class InterfaceQuestion8 {
    public static void main(String args[]){
        F f = new F();
        f.clean();
        f.sweep();
        System.out.println(f.a);
    }
}
