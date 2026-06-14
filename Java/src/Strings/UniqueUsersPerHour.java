package Strings;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class UniqueUsersPerHour {

    public static void main(String[] args) {

        List<String> logs = Arrays.asList(
                "user1,LOGIN,2026-06-05 10:15:20",
                "user2,VIEW,2026-06-05 10:20:15",
                "user1,CLICK,2026-06-05 10:30:00",
                "user3,LOGIN,2026-06-05 11:05:00",
                "user2,LOGOUT,2026-06-05 11:15:00",
                "user1,LOGIN,2026-06-05 10:15:20",
                "user1,LOGIN,2026-06-05 10:15:20"
        );

        UniqueUsersPerHour.getUniqueUsersPerHour(logs);
        UniqueUsersPerHour.getUniqueUsers(logs);
        UniqueUsersPerHour.getUsersForActionWithFrequency(logs,3,"LOGIN");
    }

       public static void getUniqueUsersPerHour(List<String> logs){
            Map<String, Set<String>> usersPerHour = new HashMap<>();

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

            for (String log : logs) {
                String[] parts = log.split(",");
                String userId = parts[0];
                String timestamp = parts[2];
//                LocalDateTime dateTime =
//                        LocalDateTime.parse(timestamp, formatter);
                String hourBucket = timestamp.substring(0, 13);
                usersPerHour
                        .computeIfAbsent(hourBucket, k -> new HashSet<>())
                        .add(userId);
            }

            for (Map.Entry<String, Set<String>> entry :
                    usersPerHour.entrySet()) {

                System.out.println(
                        entry.getKey() + " -> " +
                                entry.getValue().size());
            }
        }


        public static void getUniqueUsers(List<String> logs){
            Set<String> userSet= new HashSet<>();
            for (String log:logs) {
                String[] parts = log.split(",");
                String userId = parts[0];
                String timestamp = parts[2];
                userSet.add(userId);;

            }

            System.out.println(userSet);
        }

        public static  void getUsersForActionWithFrequency(List<String> logs, int minActionCount, String action){
            Map<String, Integer> actionMap= new HashMap<>();

            for(String log: logs){
                String[] parts = log.split(",");
                String userId = parts[0];
                String currentAction= parts[1];

                if(currentAction.equalsIgnoreCase(action)){
                    if(actionMap.containsKey(userId)){
                        actionMap.put(userId,actionMap.get(userId)+1);
                    }else{
                        actionMap.put(userId,1);
                    }
                }

            }


            for(Map.Entry<String,Integer> map:actionMap.entrySet() ){
                if(map.getValue()>=minActionCount){
                    System.out.println(map.getKey()+" User performed "+action+ " "+map.getValue()+ " times.");
                }
            }
        }


        public static  void getMostFrequentUserInSlidingWindow(List<String> logs, int window){

        }
    }
