package main.java.JavaExceptions;

public class ExceptionsQuestion15 {
    public static void main(String args[]) {
        String s = null;
        try {
            if (s.equals("gfg"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (Exception e) {
            System.out.print(e);
        }
    }
}

