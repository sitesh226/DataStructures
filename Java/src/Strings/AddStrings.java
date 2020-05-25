package Strings;

/*
*
* Given two non-negative integers num1 and num2 represented as string, return the sum of num1 and num2
* Note : Can't convert string to int directly .
 */

public class AddStrings {
    private static String addStrings(String s1,String s2){
        StringBuilder result=new StringBuilder();
        int index1=s1.length()-1;
        int index2=s2.length()-1;
        int sum=0;
        int carry=0;

        while(index1>=0&&index2>=0){
            int temp=Character.getNumericValue(s1.charAt(index1))+Character.getNumericValue(s2.charAt(index2))+carry;
            carry=temp/10;
            sum=temp%10;
            result.append(sum);
            index1--;
            index2--;
        }


        String remainingString=s1.length()>s2.length()?s1:s2;
        int index=Math.max(index1,index2);

        while(index>=0){
            int temp=Character.getNumericValue(remainingString.charAt(index))+carry;
            carry=temp/10;
            sum=temp%10;
            result.append(sum);
            index--;
        }

        if(carry>0){
            result.append(carry);
        }

        return result.reverse().toString();
    }


    public static void main(String[] args) {
        String s1="999";
        String s2="34";
        System.out.println("Addition of strings:"+ addStrings(s1,s2));

    }
}
