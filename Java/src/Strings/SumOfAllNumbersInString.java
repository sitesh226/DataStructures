package Strings;

public class SumOfAllNumbersInString {


    private static int getSumOfAllNumbersInString(String input){

        int sum=0;
        String temp="";

        for(int i=0;i<input.length();i++){

            char currentChar=input.charAt(i);

            if(Character.isDigit(currentChar))
                temp+=currentChar;
            else{
                sum=sum+Integer.parseInt(temp);
                temp="0";
            }
        }
        //For trailing numbers
        return sum+Integer.parseInt(temp);
    }
    public static void main(String[] args) {
        String str = "12abc20yz68";
        System.out.println("Sum of all numbers in String:"+ getSumOfAllNumbersInString(str));
    }
}
