package Arrays;

import java.util.Arrays;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;

public class MaxPlatformsNeeded {
	
	
	
	public static void main(String args[])
	{
 
		int arr[] = {100, 140, 150, 200, 215, 400};
		int dep[] = {110, 300, 210, 230,315, 600};
		System.out.println("Minimum platforms needed:"+findPlatformsRequiredForStation(arr,dep,6));
	}

	private static int findPlatformsRequiredForStation(int[] arr, int[] dep, int n) {
		int i=0;
		int j=0;
		Arrays.sort(arr);
		Arrays.sort(dep);
		int maxplatforms=0;
		int platformsNeeded=0;
		
		while(i<n&&j<n) {
			if(arr[i]<dep[j]) {
				platformsNeeded++;
				i++;
				if(platformsNeeded>maxplatforms)
					maxplatforms=platformsNeeded;
			}else {
				platformsNeeded--;
				j++;
			}
			
		}
		return maxplatforms;
	}

}
