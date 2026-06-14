package Arrays;

import java.sql.SQLOutput;
import java.util.TreeSet;

public class ElevatorScheduler {

    public static  void elevatorAlgorithm(int[] inputFloors, int currentFloor,String currentDirection){

        TreeSet<Integer> requests= new TreeSet<>();
        for(Integer i: inputFloors){
            requests.add(i);
        }


        if(currentDirection.equalsIgnoreCase("UP")){
            System.out.println("Elevator moving UP, currently on floor "+currentFloor);
            // if lift is moving up

            // first higher floors
            for(Integer floor: requests.tailSet(currentFloor,false)) // gives all elements in treeset higher than current
                System.out.println(floor);

            // then lower floors in descending order
            for (Integer floor : requests.headSet(currentFloor, false).descendingSet()) {
                System.out.println(floor);
            }

        }else{
            // if lift is moving down
            System.out.println("Elevator moving DOWN, currently on floor "+currentFloor);
            // first lower floors in descending order
            for (Integer floor : requests.headSet(currentFloor, false).descendingSet()) {
                System.out.println(floor);
            }

            // then higher floors
            for(Integer floor: requests.tailSet(currentFloor,false)) // gives all elements in tree set higher than current
                System.out.println(floor);



        }
    }


    public static void main(String[] args) {
        int[] floorRequests= {2,8,10,1};
        ElevatorScheduler.elevatorAlgorithm(floorRequests,5,"DOWN");
    }
}
