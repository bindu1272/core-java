package main.java.AccessModifiers;
class E{
    void display(){
        System.out.println("hi bindu");
    }
    int personAge = 20;
}

public class AccessModifiersQuestion4 extends E {
    public static void main(String args[]){
        AccessModifiersQuestion4 q = new AccessModifiersQuestion4();
        System.out.println(q.personAge);
        q.display();
    }

}
