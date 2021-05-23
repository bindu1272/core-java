package main.java.JavaCollections;
import java.util.HashSet;

public class CollectionsHashsetQuestion {
    public static void main(String args[]){
        HashSet<String> vehicles = new HashSet<>();
        vehicles.add("car");//adding the elements in a hashset
        vehicles.add("bus");
        vehicles.add("auto");
        vehicles.add("bike");
        vehicles.add("auto");//adding duplicate element
        vehicles.contains("bike");//whether an element is present or not
        vehicles.remove("auto");//remove the element in a hashset
        vehicles.size();//length of the hashset
        vehicles.clear();//clear the hashset
        for(String i : vehicles){//iterate through hashset
            System.out.println(i);
        }
    }
}
