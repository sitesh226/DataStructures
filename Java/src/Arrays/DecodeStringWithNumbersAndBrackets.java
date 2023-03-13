package Arrays;

import java.util.Stack;

public class DecodeStringWithNumbersAndBrackets {

    /*
    *
    * Input: s = "3[a]2[bc]"
Output: "aaabcbc"
Input: s = "3[a2[c]]"
*
Output: "accaccacc"
     */

    public static String decodeString(String input) {

        Stack<Integer> integerStack=new Stack<>();
        Stack<String> characterStack=new Stack<>();
        String result="";
        int index=0;

        while(index<input.length()){

            if(Character.isDigit(input.charAt(index))){
                int number=0;
                while(Character.isDigit(input.charAt(index))){
                    number=10* number+input.charAt(index)-'0';
                    index+=1;
                }
                integerStack.push(number);


            } else if (input.charAt(index)=='[') {
                characterStack.push(result);
                result="";
                index+=1;

            } else if (input.charAt(index)==']') {
                StringBuilder temp=new StringBuilder(characterStack.pop());
                int number=integerStack.pop();
                for (int i=0;i<number;i++){
                    temp.append(result);
                }
                result=temp.toString();
                index+=1;

            }else {
                result+=input.charAt(index);
                index+=1;
            }
        }
        System.out.println("Input String : "+ input);
        System.out.println("Decoded String : "+ result);
        return result;

    }


    public static void main(String[] args) {

        DecodeStringWithNumbersAndBrackets obj=new DecodeStringWithNumbersAndBrackets();
        decodeString("3[a2[c]]");



    }
}



