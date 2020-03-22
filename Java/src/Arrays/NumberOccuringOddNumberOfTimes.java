package Arrays;

public class NumberOccuringOddNumberOfTimes {
	
	
	public int getOddTimesElement(int[] arr) {
		int result=0;
		for(int i=0;i<arr.length;i++) {
			result=result^arr[i];
			System.out.println(result);
		}
		
		return result;
	}
	
	
	public static void main(String[] args) {
		NumberOccuringOddNumberOfTimes occur=new NumberOccuringOddNumberOfTimes();
		int[] input= new int[]{20, 40, 50, 40, 20, 30, 30, 50, 20, 40, 40, 20};
		occur.getOddTimesElement(input);
		
	}

}
