package main.java.ThisAndSuperKey;
//Printing the feilds or instance members in a class using this keyword..it Works fine.
//public class ThisAndSuperQuestions {
//    int x;
//    ThisAndSuperQuestions(int x){
//        this.x = x;
//    }
//    public static void main(String args[]){
//        ThisAndSuperQuestions thisAndSuperQuestions = new ThisAndSuperQuestions(10);
//        System.out.println(thisAndSuperQuestions.x);
//    }
//}

//printing feilds without this keyword..  This will return 0;instead of 10.
public class ThisAndSuperQuestions {
    int x;
    ThisAndSuperQuestions(int x){
        x = x;
    }

    public static void main(String args[]){
        ThisAndSuperQuestions thisAndSuperQuestions = new ThisAndSuperQuestions(10);
        System.out.println(thisAndSuperQuestions.x);
    }
}
