package main.java.Interfaces;
interface X{ //Private or protected doesnt allow for the interfaces
//    private int a = 20;
//    protected  int b = 30; ///only static and final variables accepted.
    static int c = 60;
    final int d = 90;
    public void getName();
}
class Y implements X{
    public void getName(){
        System.out.println("bindu");
    }
}
public class InterfaceAllQuestions {
    public static void main(String args[]){
        Y y = new Y();
        y.getName();
        System.out.println(y.c);
        System.out.println(y.d);
    }

}
