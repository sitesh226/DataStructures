package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class CheckBookingPossible {

    private static boolean isBookingPossible(ArrayList<Integer> arrival, ArrayList<Integer> departure, int numberOfRooms){
        Collections.sort(arrival);
        Collections.sort(departure);

        int i=0,j=0;
        int size=arrival.size();
        int roomsNeeded=0;
        int maxRooms=0;

        while(i<size&&j<size){
            if(arrival.get(i)<departure.get(j)){
                roomsNeeded++;
                maxRooms=Math.max(maxRooms,roomsNeeded);
                i++;
            }else{
                roomsNeeded--;
                j++;
            }
        }

        return numberOfRooms>=maxRooms;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrival=new ArrayList<>();
        arrival.add(1);
        arrival.add(3);
        arrival.add(5);
        ArrayList<Integer> departure=new ArrayList<>();
        departure.add(2);
        departure.add(6);
        departure.add(8);
        System.out.println("Is booking possible: "+ isBookingPossible(arrival,departure,1));
    }
}
