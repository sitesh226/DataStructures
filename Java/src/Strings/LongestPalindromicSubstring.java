package Strings;

public class LongestPalindromicSubstring {

    //Time O(n^2), Space O(1)
    private static String getLongestPalindromicSubString(String inputString){
        String longest=inputString.substring(0,1);

        for (int i=0;i<inputString.length();i++){
            //When only 1 character is centre
            String temp=expandFromCentre(inputString,i,i);
            if(temp.length()>longest.length())
                longest=temp;


            //When 2 characters are centre
            temp=expandFromCentre(inputString,i,i+1);
            if(temp.length()>longest.length())
                longest=temp;

        }

        return longest;
    }

    private static String expandFromCentre(String input,int left,int right){
        while(left>=0&&right<input.length()&&input.charAt(left)==input.charAt(right)){
            left--;
            right++;
        }
        return input.substring(left+1,right);
    }

    public static void main(String[] args) {
        String input="aaaabaaa";
        System.out.println("Longest Palindromic substring: "+getLongestPalindromicSubString(input));
    }


}
