package Arrays;

public class MergeSortedArrays {


    public static int[] mergeArrays(int[] arr1, int[] arr2) {
        int size = arr1.length + arr2.length;
        int[] result = new int[size];


        int i = 0;
        int j = 0;
        int k = 0;
        while (i<arr1.length&& j<arr2.length) {

            if (arr1[i] < arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        while(i<arr1.length)
            result[k++]=arr1[i++];

        while(j<arr2.length)
            result[k++]=arr1[j++];

        return result;


    }

    public static void main(String[] args){
        int[] arr1={1,3,5,9};
        int[] arr2={2,4,7,8};
      int[] result=  mergeArrays(arr1,arr2);
      for(int i:result){
          System.out.print(i+" ");
      }
    }
    }
