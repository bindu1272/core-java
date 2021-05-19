package main.java.Strings;
import java.util.regex.*;

public class AllStringQuestions {
        public static void main(String[] args) {
            //ways to create a string
            String s = "oops";
            String s1 = new String("Java");
            char ch[] = {'T','e','c','h','n','o','l','o','g','y'};
            String s2 = new String(ch);
            System.out.println("Strings created : "+ s + " - " + s1 + " - " + s2);
            s = s1 + " " + s2;
            System.out.println("Concatenation of two strings : " + s);
            System.out.println("Below operations Operated using the string : " + s);
            System.out.println("Length of the string: " + s.length());
            System.out.println("Substring :" + s.substring(5));
            System.out.println("IndexOf Java in s :" + s.indexOf("Tech"));
            Pattern pattern = Pattern.compile("Java", Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(s);
            boolean matchFound = matcher.find();
            if(matchFound) {
                System.out.println("Match found");
            } else {
                System.out.println("Match not found");
            }
            System.out.println("s1 == s2 : " + s1.equals(s2));
            System.out.println("equalsIgnoreCase() : " + s1.equalsIgnoreCase("java"));
            System.out.println("startswith java: " + s.startsWith("Java"));
            System.out.println("endswith gy: " + s.endsWith("gy"));
            System.out.println("startswith : " + s1.compareTo(s2));
            System.out.println("    java trim(): "+ "    java  ".trim());
            System.out.println("Technology replace with  Language: " + s.replace("Technology","Language"));
            String character[] = s.split(" ");
            System.out.print("Spliting the string : ");
            for(String c:character){
                System.out.print(c+" ");
            }
            int num = 10;
            System.out.println("\nInteger to String: " + String.valueOf(num));
            Integer integer = new Integer(10);
            System.out.println("Integer Object to String: " + String.valueOf(integer));
            System.out.println("LowerCase: " + s.toLowerCase());
            System.out.println("UpperCase: " + s.toUpperCase());
        }
}


