package main.java.Interfaces;
interface  Animal{
    public void sleep();
}
class Dog implements Animal{
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
}
public class InterfaceQuestion1 {
    public static void main(String args[]){
            Dog d = new Dog();
            d.sleep();
    }
}
