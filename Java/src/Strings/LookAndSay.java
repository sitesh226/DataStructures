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


    private static void generateLookAndSaySequenceSimplified(int n){
        if(n<=0){
            System.out.println("Invalid Input");

        }
        String result="1";
        System.out.println("1");

        while(n>0) {

            StringBuilder current = new StringBuilder();
            for (int i = 0; i < result.length(); i++) {
                int count = 1;
                while (i + 1 < result.length() && result.charAt(i) == result.charAt(i + 1)) {
                    ++count;
                    ++i;
                }
                current.append(count).append(result.charAt(i));
            }
            System.out.println(current);
            result=current.toString();
            n--;
        }
    }

    public static void main(String[] args) {
       // generateLookAndSaySequence(7);
        generateLookAndSaySequenceSimplified(7);
    }
}
