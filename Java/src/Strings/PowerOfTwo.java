package Strings;

/*
* Check whether a number is power of two or not.
 */

public class PowerOfTwo {

    private static int isPowerOfTwo(int num){
        if(num==0)
            return 0;
        while(num!=1){
            if(num%2!=0)
                return 0;
            else
                num=num/2;
        }
        return 1;

    }

    public static void main(String[] args) {
        int input=60;
        System.out.println("Is number power of two: "+isPowerOfTwo(input));
    }
}
