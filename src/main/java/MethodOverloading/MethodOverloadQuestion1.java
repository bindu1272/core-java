package main.java.MethodOverloading;

public class MethodOverloadQuestion1 {
    //Same Name and Different Number of Parameters but  same datatypes
    static int getSum(int a,int b){
        int sum = a+b;
        return sum;
    }
    static int getSum(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }
    //Same Name but different Datatypes.
    static void getDetails(int age,String name){
            System.out.println(age+" "+name);
    }
    static void getDetails(String fname,String lname,String fullname){
            System.out.println(fname+" "+lname+" "+fullname);
    }
    //Same Name and Same Number of Parameters of Same type
//    static void getCount(double c,double d){
//
//    }
//    static  void getCount(double e,double f){
//
//    }
    //Same Name and same number of parameters of different types
    static void getStatus(int english,String name){
            System.out.println(english+" "+name);
    }
    static void getStatus(String name,int maths){
            System.out.println(name +" "+maths);
    }
    //Same Name,number of parameters and data type but different return type. These are not accepting.
//    static  int getMarks(int telugu,int english){
//        int addition = telugu+english;
//        return addition;
//    }
//    static double getMarks(int telugu,int english){
//        double add = telugu+english;
//        return add;
//    }
    public static void main(String args[]){
        System.out.println(getSum(10,20));
        System.out.println(getSum(10,20,30));
        getDetails(20,"bindu");
        getDetails("vankayalapati","bindu","binduchowdary");
        getStatus(40,"bindu");
        getStatus("bindu",60);

    }
}
