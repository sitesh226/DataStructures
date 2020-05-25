package Arrays;

import java.util.ArrayList;

/*
*Given a non-negative number represented as an array of digits,
*add 1 to the number ( increment the number represented by the digits ).
*The digits are stored such that the most significant digit is at the head of the list.
 */
public class AddOneToNumber {

    private static ArrayList<Integer> incrementByOne(ArrayList<Integer> input){

        int i=input.size()-1;
        int carry=1;
        while(i>=0){
            int temp=carry+input.get(i);
            carry=temp/10;
            temp=temp%10;
            input.set(i,temp);
            i--;
        }

        if(carry>0)
            input.add(0,carry);
        return input;
    }

    public static void main(String[] args) {
        ArrayList<Integer> input=new ArrayList<>();
        input.add(9);
        input.add(9);
        input.add(9);

        System.out.println("Array input  :"+input);
        System.out.println("Array after adding 1 :"+incrementByOne(input));

    }

}
