package Arrays;

import java.util.*;

public class StringArrayRearrangement {
    boolean isRearrangementPossible(String[] inputArray) {
        List<String> input = Arrays.asList(inputArray);




        ArrayList<String> output = new ArrayList<>();
        output.add(input.get(0));
        for(int i=1;i<inputArray.length;i++){
            String lastAdded = output.get(output.size()-1);
            String nextString = nextStringExists(lastAdded,input);
            if(nextString=="false"){
                return false;
            }else{
                output.add(nextString);
                input.remove(nextString);
            }
        }

        return true;

    }


    public String nextStringExists(String currentString, List<String> input){
        for(String str: input){
            int misMatchCount =0;
            for(int i=0;i<currentString.length();i++){
                if(currentString.charAt(i)!=str.charAt(i))
                    misMatchCount++;
            }
            if(misMatchCount==1)
                return str;
        }
        return "false";

    }




    public static void main(String[] args) {

        StringArrayRearrangement obj = new StringArrayRearrangement();
        //String[] input = {"aba", "bbb", "bab"};
        String[] input = {"\"ab\", \"bb\", \"aa\""};
        System.out.println(obj.isRearrangementPossible(input));

    }
}
