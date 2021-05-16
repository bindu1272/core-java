package main.java.AccessModifiers;
class C{
    protected int age = 18;
    protected String name = "Bindu";

}

public class AccessModifiersQuestion3 extends C{
    private  int marks = 80;
    public static void main(String args[]){
        AccessModifiersQuestion3 q = new AccessModifiersQuestion3();
        System.out.println(q.marks+" "+q.age+" "+q.name);
    }

}
