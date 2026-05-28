package Strings;

//Given a string, output its longest prefix which contains only digits.

public class LongestDigitPrefix {
    String getLongestDigitPrefix(String inputString) {

        StringBuilder longestDigitString = new StringBuilder();
        if(!Character.isDigit(inputString.charAt(0)))
            return "";

        for(int i=0;i<inputString.length();i++){
            StringBuilder temp = new StringBuilder();
            if(Character.isDigit(inputString.charAt(i))){
                temp.append(inputString.charAt(i));
                int j= i+1;
                while((j<inputString.length())&&Character.isDigit(inputString.charAt(j))){
                    temp = temp.append(inputString.charAt(j));
                    j++;

                }

                return temp.toString();
            }

        }
        return "";
    }

    public static void main(String[] args) {
        LongestDigitPrefix digitPrefix = new LongestDigitPrefix();
        System.out.println(digitPrefix.getLongestDigitPrefix("  3) always check for whitespaces"));
        System.out.println(digitPrefix.getLongestDigitPrefix("123aa1"));

    }


}
