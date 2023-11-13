package Strings;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapMethods {

    public static void computeDemo(HashMap<String,Integer> map){

        // map.put("team1",map.get("team1")+1);  this is equivalent to
        map.compute("team1",(team,goal) ->goal+1);
        System.out.println(map);


//        if(map.containsKey("team1")){
//            map.put("team1",map.get("team1")+1);
//        }
        // this is equivalent to
        map.computeIfPresent("team1",(team,goal)->goal+1);
        System.out.println(map);


//        if(!map.containsKey("team3")) {
//            map.put("team3",0);
//        }
        // this is equivalent to :
        map.computeIfAbsent("team3",value->0);
        System.out.println(map);

        map.putIfAbsent("team4",1);
        System.out.println(map);
    }


    public static void iterateMap(){
        HashMap<Integer,String> studentIDNameMap=new HashMap<>();
        studentIDNameMap.put(101,"Andy");
        studentIDNameMap.put(102, "Mary");
        studentIDNameMap.put(103, "Sam");
        studentIDNameMap.put(104,"Sandy");

        System.out.print("Entry set :");
        Set<Entry<Integer,String>> entrySet =studentIDNameMap.entrySet();
        System.out.println(entrySet);

        System.out.print("Key set :");
        Set<Integer> keySet=studentIDNameMap.keySet();
        System.out.println(keySet);

        System.out.print("Values:");
        Collection<String> values=studentIDNameMap.values();
        System.out.println(values);

        System.out.println("Iterating hashmap:");
        studentIDNameMap.forEach((id,name) -> {
            System.out.println(id+" --> "+name);
        });
    }

    public static void main(String[] args) {

        HashMap<String,Integer> teamGoalMap=new HashMap<>();
        teamGoalMap.put("team1",1);
        teamGoalMap.put("team2",2);
        System.out.println(teamGoalMap);
        HashMapMethods.computeDemo(teamGoalMap);


        HashMapMethods.iterateMap();



    }
}
