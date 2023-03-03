package Arrays;

import java.util.ArrayList;

public class RemoveThreeConsecutiveDuplicates {


    public static String removeConsecutiveDuplicates(String input){
        String output="";
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<input.length();i++){
            arr.add(input.charAt(i));

            if(arr.size()>2){
                int size=arr.size();

                if(arr.get(size-1)==arr.get(size-2)&&arr.get(size-2)==arr.get(size-3)){
                    arr.remove(size-1);
                    arr.remove(size-2);
                    arr.remove(size-3);
                }
            }
        }

        for (Character character:arr)
            output+=character;
        System.out.println(output);
        return output;
    }

    public static void main(String[] args){
        String str = "aabbbaccddddc";
        removeConsecutiveDuplicates(str);
    }
}
