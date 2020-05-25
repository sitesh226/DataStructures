package Arrays;

/*
*We have two special characters. The first character can be represented by one bit 0. The second character can be represented by two bits (10 or 11).

Now given a string represented by several bits. Return whether the last character must be a one-bit character or not.
* The given string will always end with a zero
 */

public class OneBitAndTwoBitCharacter {

    private static boolean isOneBitCharacter(int[] bits){
        int index=0;
        int n=bits.length;

        while(index<n){
            if(bits[index]==1){
                if(index+1==n-1)
                    return false;
                else
                    index = index + 2;
                } else{
                index=index+1;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        int[] bits={1,0,1,0};
        System.out.println(isOneBitCharacter(bits));
    }
}
