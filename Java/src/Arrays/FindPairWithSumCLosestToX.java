package Arrays;

import java.util.Arrays;

public class FindPairWithSumCLosestToX {

	public static void main(String[] args)
	{
		int array[]={-40,1,3,6,7,8,20};
		findPairWithClosestToX(array,9);
		findAllPairsEqualToX(array,9);
		
		int array1[]={-40,29,3,26,7,8,20};
		findLeadersInArray(array1);

	}

	private static void findLeadersInArray(int[] arr) {
		
		System.out.println("Leaders in array:");
		
		//leader is an element which is greater than all elements to its right.
		//last element is always leader;
		int rightMax=arr[arr.length-1];
		System.out.print(rightMax+ "  ");
		
		for(int i=arr.length-2;i>=0;i--) {
			if(arr[i]>rightMax) {
				rightMax=arr[i];
				System.out.print(rightMax+ "  ");
			}
		}
		
	}

	private static void findAllPairsEqualToX(int[] arr, int X) {
		int l=0;
		int r=arr.length-1;
		

		while(l<r) {
			int currentSum=arr[l]+arr[r];
			if(currentSum==X) {
				System.out.println("Pair:" +arr[l]+ " "+arr[r]);
			}
			
			if(currentSum<X) {
				l++;
			}else {
				r--;
			}
		}
		
	}

	private static void findPairWithClosestToX(int[] arr, int X) {
	
		
		Arrays.sort(arr);
		
		int minDiff=Integer.MAX_VALUE;
		int l=0;
		int r=arr.length-1;
		int minLeft=l;
		int minRight=r;
		
		while(l<r) {
			
			if(Math.abs(arr[l]+arr[r])<Math.abs(minDiff)) {
				minDiff=arr[l]+arr[r];
				minLeft=l;
				minRight=r;
			}
			
			if((arr[l]+arr[r])<X) {
				l++;
			}
			else {
				r--;
			}
		}
		
		System.out.println("Pair closest to X: "+arr[minLeft]+"   "+arr[minRight]);
		
	}
}
