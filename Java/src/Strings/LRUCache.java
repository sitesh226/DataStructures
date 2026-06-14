package Strings;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {

    int capacity;
    Map<Integer,String> cache= new LinkedHashMap<>();

    public LRUCache(int capacity){
       this.capacity= capacity;
    }

    public String getElement(int key){
        if(!cache.containsKey(key)){
            return null;
        }

        String value= cache.get(key);
        cache.remove(key); // remove and add so that the key becomes the most recent used
        cache.put(key,value);
        return  value;

    }


    public  void insertElement(int key, String value){
        if(cache.containsKey(key)){
            cache.remove(key); // remove it already contains
        }

        cache.put(key,value);
        if(cache.size()>capacity){
            // Find oldest and remove
            Integer oldestKey =
                    cache.keySet().iterator().next(); // this gives the first or oldest  element
            cache.remove(oldestKey);

        }


    }

    public static void main(String[] args) {

        LRUCache cache = new LRUCache(2);

        cache.insertElement(1, "A");
        cache.insertElement(2, "B");
        cache.getElement(1);
        cache.insertElement(3, "C");
        System.out.println(cache.cache);
    }


}
