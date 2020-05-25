package Arrays;

/*
*We are given a read only array of n integers.
* Find any element that appears more than n/3 times in the array in linear time and constant additional space.
*  If no such element exists, return -1.
 */
public class N3RepeatedElementInArray {

    private static int getN3RepeatedElement(int[] arr){
        int count1=0;int count2=0;
        int first=Integer.MAX_VALUE;
        int second=Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++){
            if(first==arr[i])
                count1++;
            else if(second==arr[i])
                count2++;
            else if(count1==0){
                first=arr[i];
                count1++;
            }else if(count2==0){
                second=arr[i];
                count2++;
            }else{
                //Element is different from first and second
                count1--;
                count2--;
            }
        }

        count1=0;
        count2=0;
        //traverse the array to get actual counts of first and second
        for(int i=0;i<arr.length;i++){
            if(arr[i]==first)
                count1++;
            else if(arr[i]==second)
                count2++;
        }

        if(count1>arr.length/3)
            return first;
        if(count2>arr.length/3)
            return second;

        return -1; //If N/3 element does not exist;
    }


    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 1, 1 };
        System.out.println("Element occurring more than N/3 time:"+getN3RepeatedElement(arr));
    }
}
