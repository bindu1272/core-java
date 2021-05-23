package main.java.JavaCollections;

import java.util.HashMap;
import java.util.Map;

public class CollectionsHashmapQuestion {
    public static void main(String args[]){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"bindu");//Inserting a key value into a map.
        map.put(2,"jyothi");
        map.put(3,"padma");
        map.put(4,"anjaiah");
        map.put(5,"babu");
        map.put(6,"krishna");
        map.put(7,"saritha");
        map.put(8,"varma");
        map.put(9,"srilakshmi");
        map.put(10,"siva");
        map.get(4);//get the key from the value
        HashMap<Integer, String> new_hash_map = new HashMap<Integer, String>();
        new_hash_map.putAll(map); //copy one hashmap into another hashmap.
        map.size();//size of the map
        map.containsKey(2);//checking whether key is there or not in map
        map.containsValue("varma");//checking whether value is there or not in map
        map.isEmpty();//check whether map is empty or not.
        for(Map.Entry entry : map.entrySet()){ //getting all the keys in a map.
            System.out.println(entry.getKey());
        }
        map.remove(7);//removing specific key value pair in a map
    }
}
