package main.java.AbstractClass;
abstract class Animal{
    public abstract void animalSound();
    public void sleep(){
        System.out.println("Animal sleeping sound");
    }
}
class dog extends Animal{
    public void animalSound(){
        System.out.println("different animals different sounds");
    }
    public void dogSleep(){
        System.out.println("dog sleep");
    }
}
class cat extends dog{
    public void animalSound(){
        System.out.println("cat sounds");
    }
    public void catSleep(){
        System.out.println("catsleep");
    }
}

public class AllAbstractQuestions {
    public static void main(String args[]) {
        dog d = new dog();
        d.sleep();//non abstract methods
        d.dogSleep();
        d.animalSound(); //abstract methods
        cat c = new cat();
        c.animalSound();
        c.catSleep();
    }
}
