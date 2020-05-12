package Arrays;

public class CheckWhetherArrayElementsAreConsecutive {

    private static boolean isConsecutive(int[] arr){

        if(arr.length<1)
            return false;

        int min=getMin(arr);
        int max=getMax(arr);

        if(max-min==arr.length-1){
            boolean[] visited=new boolean[arr.length];
            for(int i=0;i<=arr.length-1;i++){

                if(visited[arr[i]-min]!=false)  //visiting second time
                    return false;

                visited[arr[i]-min]=true;

            }

            return true;//If all elements occur once;
        }
            return false;

    }


    private static int getMin(int[] arr){
        int min=arr[0];

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }

    private static int getMax(int[] arr){
        int max=arr[0];

        for(int i=1;i<arr.length-1;i++){
            if(arr[i]>max)
                max=arr[i];
        }
        return max;
    }


    public static void main(String[] args) {
        int [] arr={83, 78, 80, 81, 79, 82};
        System.out.println("Is elements consecutive: "+isConsecutive(arr));
    }
}
