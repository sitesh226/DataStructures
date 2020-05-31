package Strings;

public class RomanToInt {

    private static int getIntValue(String romanNumber){

        int result=0;
        for(int i=0;i<romanNumber.length();i++){

            int s1=valueOfChar(romanNumber.charAt(i));
            if(i+1<romanNumber.length()){
                int s2=valueOfChar(romanNumber.charAt(i+1));
                if(s1>=s2){
                    result+=s1;
                }else{
                    //Since 2 characters are equivalent to one digit like IV or IX.
                    result+=s2-s1;
                    i++;
                }
            }else{
                result+=s1;
                i++;
            }
        }
        return result;
    }

    private static int  valueOfChar(char c){
        if(c=='I')  return 1;
        if(c=='V')  return 5;
        if(c=='X')  return 10;
        if(c=='L')  return 50;
        if(c=='C')  return 100;
        if(c=='D')  return 500;
        if(c=='M')  return 1000;
        return -1;

    }

    public static void main(String[] args) {
        String romanNumber="MCMIV";
        System.out.println("Int value of "+romanNumber+ "  :"+getIntValue(romanNumber));
    }
}
