package main.java.JavaCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class CollectionsArrayListQuestion {
    public static void main(String args[]){
        List<String> list = Arrays.asList("guava","grapes","banana","apple","pineapple","oranges","dates","omla","lemon","papaya");
        List<String> list1 = new ArrayList<>();
        list1.addAll(list);
        list1.add("strawberry");//add the element in a list.
        Iterator i = list1.iterator(); //Iterating through a list
        while (i.hasNext()){
            Object element = i.next();
            System.out.print(element+" ");
        }
        list1.set(2,"neem");//Add an element to an specific index.
        list1.remove("grapes");//Remove an element in a list
        list1.remove(4);//Remove an element from an specific index.
        list1.set(4,"banana");//update the element by  an index
        int  s = list1.indexOf(5);
        list1.get(5);//get the element at an index
        list1.size();//size of the arraylist
        list1.contains("apple");//given element present in the list or not.
//        list1.clear();//remove all the elements in a list
        for(String x : list1){
            System.out.print(x+" ");
        }
    }
}
