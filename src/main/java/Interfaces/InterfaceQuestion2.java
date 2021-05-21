package main.java.Interfaces;
interface Fruits{
    public void seedless();
    public void seeds();
}
class Grapes implements Fruits{
    public void seedless(){
        System.out.println("Grapes doesnt contains seeds");
    }
   //If i implement only one method in interface and call then it will say warning like u need to implement all the methods in interface.
   public void seeds(){
       System.out.println("Grapes contians seeds");
   }
}

public class InterfaceQuestion2 {
    public static void main(String args[]){
        Grapes g = new Grapes();
        g.seedless();
        g.seeds();
    }
}
