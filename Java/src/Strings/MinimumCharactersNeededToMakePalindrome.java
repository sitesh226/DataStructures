package Strings;

public class MinimumCharactersNeededToMakePalindrome {

    private static int getMinimumCharactersNeededToMakePalindrome(String input){
        int count=0;
        while(input.length()>0){
            if(isPalindrome(input)){
                break;
            }else{
                count++;
                input=input.substring(0,input.length()-1);
            }
        }

        return count;
    }

    private static boolean isPalindrome(String input) {
        StringBuilder stringBuilder=new StringBuilder(input) ;
        return stringBuilder.reverse().toString().equals(input);
    }

    public static void main(String[] args) {
        String s = "BABABAA";
        System.out.println("Minimum number of characters needed to make palindrome:"+ getMinimumCharactersNeededToMakePalindrome(s));

    }

}
