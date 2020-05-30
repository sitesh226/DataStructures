package Strings;

/*
*Given a string s consists of upper/lower-case alphabets and empty space characters ' ',
* return the length of last word in the string.
* If the last word does not exist, return 0.
 */
public class LengthOfLastWord {

    private static int getLengthOfLastWord(String input){
        int result=0;
        String[] inputArray=input.split(" ");
        if(inputArray.length==1)
            return 0;
        else
            result=inputArray[inputArray.length-1].length();

        return result;
    }

    public static void main(String[] args) {
        String input="Hello World";
        System.out.println("Last word length: "+getLengthOfLastWord(input));
    }

}
