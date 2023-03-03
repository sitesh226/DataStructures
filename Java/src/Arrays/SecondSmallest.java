package Arrays;

public class SecondSmallest {

    public static int secondSmallest(int[] x) {

        if (x.length < 1)
            return -1;

        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0; i < x.length; i++) {
            if (x[i] <= smallest) {

                secondSmallest = smallest;
                smallest = x[i];
            } else if (x[i] < secondSmallest) {
                secondSmallest = x[i];
            }
        }
        return secondSmallest;
    }


    public static void main(String[] args) {
        int [] arr={0,1,3,4,5};
        System.out.println( secondSmallest(arr));
    }
}
