package Arrays;

public class CountOfEachWordInArray {
	
	
	public void  getCountOfEachWord(String [] arr) {
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
				
			while(i+1<arr.length&&arr[i]==arr[i+1]) {
				i++;
				count++;
			}
			System.out.println(arr[i]+ " : "+count);
		}
	}
	
	public static void main(String[] args) {
		CountOfEachWordInArray object=new CountOfEachWordInArray();
		String [] inputArray= {"foo","foo","foo","bar","bar","foo","foo"};
		object.getCountOfEachWord(inputArray);
		
	}

}
