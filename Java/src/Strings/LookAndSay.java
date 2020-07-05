package Strings;

import java.util.ArrayList;

public class LookAndSay {

    private static void generateLookAndSaySequence(int n){
        ArrayList<String> output=new ArrayList<>();
        output.add("1");
        output.add("11");

        for(int i=2;i<n;i++){
            String nextString="";
            char[] previousString=output.get(i-1).toCharArray();
            for (int j=0;j<=previousString.length-1;j++){
                int count=1;
                while(j+1<previousString.length&&previousString[j+1]==previousString[j]){
                    count++;
                    j++;
                }
                nextString=nextString+count+previousString[j];
            }
            output.add(nextString);

        }
        System.out.println("Sequence:"+ output);
    }

    public static void main(String[] args) {
        generateLookAndSaySequence(7);
    }
}
