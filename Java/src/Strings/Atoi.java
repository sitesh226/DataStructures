package Strings;
//
//        If strn is a valid input, then the function returns the equivalent integer
//        number for the passed string number. If no valid conversion takes place,then the function returns zero.
public class Atoi {

    private static int atoiFunction(String input){
        int result=0;
        int j=0;
        for(int i=input.length()-1;i>=0;i--){
            result+=Math.pow(10,j)*(input.charAt(i)-'0');//substract the ascii value if current digit with ascii value of number
            j++;
        }
        return result;
    }

    public static void main(String[] args) {
        String input="1234";
        System.out.println("Number equivalent to input string: "+atoiFunction(input));
    }
}
