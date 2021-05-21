package main.java.Interfaces;
interface  SystemRequirements{
    //void hardware(); //It is showing that interfaces only accept final,public and static methods only.
    //It need implementation too.
}
class RequireLaptop implements SystemRequirements{
    public void software(){
        System.out.println("Software Requirements");
    }
    public void hardware(){
        System.out.println("hardware requirements");
    }
}
public class InterfaceQuestion6 {
    public static void main(String args[]){
        RequireLaptop requireLaptop = new RequireLaptop();
        requireLaptop.hardware();

    }
}
