package main.java.Constructors;
class ConstructConcept{
    ConstructConcept(){
        System.out.println("default constructor");
    }
    protected  ConstructConcept(int a){
        System.out.println(a);
    }
    //private ConstructConcept(int a,int b){//doesnt compile because private constructors doesnt run
    public ConstructConcept(int a,int b){
        System.out.println(a+b);
    }
     ConstructConcept (int a,int b,int c){
        System.out.println(a+b+c);
    }
//    int ConstructConcept (int a,int b,int c){
//        int sum = a+b+c;
//        System.out.println(a+b+c);
//        return sum;
//    } Constructor doesnt have any return types...
}
class SubConstructor extends ConstructConcept{
    public void nothing(){
        System.out.println("no method is needed");
    }
}
public class AllConstructorQuestions {
    public static void main(String args[]) {
        ConstructConcept constructConcept = new ConstructConcept();
//        ConstructConcept constructConcept1 = new ConstructConcept(10); Calling the constructor with same type multiple times.
//        ConstructConcept constructConcept4 = new ConstructConcept(20);
        ConstructConcept constructConcept1 = new ConstructConcept(10);
        ConstructConcept constructConcept2 = new ConstructConcept(10,20);
        ConstructConcept constructConcept3 = new ConstructConcept(10,20,30);
        SubConstructor subConstructor = new SubConstructor();//it will works properly but arguments for sub class doesnt work.
        //SubConstructor subConstructor1 = new SubConstructor(10);//Argumented doesnt work.
    }
}
