package Strings;

/*
Given a string inputString, your task is to write a method that transforms all the lowercase letters to uppercase and all the uppercase letters to lowercase.
If the character is not a letter, do not transform it.
The transformation should be done without using any built-in Java methods like toLowerCase(), toUpperCase(), or similar in your code.
For example, for the input string "HelLo WoRld 123", the output should be "hELlO wOrLD 123".
 */

public class TransformStringCase {

    public String transformString(String inputString) {
        String output="";


        for(int i=0;i<inputString.length();i++){
            int currentCharAscii=inputString.charAt(i);

            if(currentCharAscii>=65&&currentCharAscii<=90){
                int currentCharPosition=currentCharAscii-65;
                int newCharAscii=97+currentCharPosition;
                output+=(char)newCharAscii;
            }
            else if(currentCharAscii>=97&&currentCharAscii<=122){
                int currentCharPosition=currentCharAscii-97;
                int newCharAscii=65+currentCharPosition;
                output+=(char)newCharAscii;
            }else{
                output+=(char)currentCharAscii;
            }
        }
        System.out.println(output);
        return output;
    }


    public static void main(String[] args) {
        TransformStringCase transformStringCase=new TransformStringCase();
        transformStringCase.transformString("cAsEcHaNgE");
    }
}
