package main.java.Operators;

public class OperatorsQuestion1 {
    public static void main(String args[]){
        int a = 10,b = 20, c = 30;
        //Arithmatic Operations
        int result = a*b+c-a/2;
        System.out.println("Arithmatic operations   "+result);
        //Increment operations
        int x = a++;
        int y = b--;
        System.out.println("Increment Operations  "+ x +" "+y);
        //equal and not equal operator
        if(a==b){
            System.out.println("equal operator");
        }
        else if(a!=b){
            System.out.println("not equal operator");
        }
        //two numbers equal or not
        int z= 10,w = 10;
        if(z==w){
            System.out.println("both numbers are equal");
        }else {
            System.out.println("both numbers are not equal");
        }
        //Logical AND,OR, and not operators
        boolean bool1 = true, bool2 = false;
        System.out.println("bool1 && bool2 = " + (bool1 && bool2));
        System.out.println("bool1 || bool2 = " + (bool1 | bool2) );
        System.out.println("!(bool1 && bool2) = " + !(bool1 && bool2));
        //Relational Operators
        System.out.println("a < b: " + (a<b));
        System.out.println("a<=b :"+(a<=b));
        System.out.println("a>b : "+(a>b));
        System.out.println("a>=b : "+(a>=b));

        //smaller and larger Number
        if(a>b){
            System.out.println("Greater is : "+ a +"smaller is : "+ b);
        }else{
            System.out.println("smaller is : "+a+"larger is : "+ b);
        }

    }
}
