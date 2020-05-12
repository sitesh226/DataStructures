package Strings;
/*
*Check if a string follows a^nb^n pattern or not
 */
public class CheckStringFollowsPatternAnBn {

    private static boolean isValidStringAsPerPattern(String input){
        if(input.length()%2==1)
            return false;
        int countOfA=0;
        int countOfB=0;

        for(int i=0;i<input.length();i++){
            if(input.charAt(i)=='a')
                countOfA++;
            else if(input.charAt(i)=='b')
                countOfB++;
            else
                return false;//Some other character
        }

        if(countOfA==countOfB)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String input="abab";
        System.out.println("Is string valid as per pattern:"+isValidStringAsPerPattern(input));
    }
}
