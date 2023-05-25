package Arrays;

public class SortedRotatedArray {
	
	public int searchElementInSortedRotatedArray(int[] arr,int low,int high,int number) {
		
	
		int mid;
		while(low<=high)
		{
			mid=low + ((high - low) / 2);;
 
			if(arr[mid]==number)
			{
				System.out.println("Search Result Index: "+ mid);
				return mid;
			}
			if(arr[mid]<=arr[high])
			{
				// Right part is sorted
				if(number > arr[mid] && number <=arr[high])
				{
					low=mid+1;
				}
				else
				{
					high=mid-1;
				}
			}
			else
			{
				// Left part is sorted
				if(arr[low]<=number && number < arr[mid])
				{
					high=mid-1;
				}
				else
				{
					low=mid+1;
				}
			}
		}
		return -1;
	}

	
	
	public int getMinimumElementInSortedRotatedArray(int [] arr,int low,int high) {
		int mid;
		while(low<=high) {
			mid=low+(high-low)/2;
			
			if(arr[mid]<arr[high]) {
				high=mid-1;
			
				
			}
			else
				low=mid+1;
			
		}
		
		return arr[low];
	}
	
	
	
	public static void main(String[] args) {
		SortedRotatedArray arrayObject=new SortedRotatedArray();
		int[] inputArray= {20,25,1,4,6,7,8};
		arrayObject.searchElementInSortedRotatedArray(inputArray, 0, inputArray.length-1,25 );
		System.out.println(arrayObject.getMinimumElementInSortedRotatedArray(inputArray, 0, inputArray.length-1 ));
	}
}
