package main.java.Constructors;
class ConstructConcept{
    ConstructConcept(){
        System.out.println("default constructor");
    }
    ConstructConcept(int a){
        System.out.println(a);
    }
}

public class AllConstructorQuestions {
    public static void main(String args[]) {
        ConstructConcept constructConcept = new ConstructConcept();
        ConstructConcept constructConcept1 = new ConstructConcept(10);

    }
}
