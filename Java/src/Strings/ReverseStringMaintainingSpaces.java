package Strings;


public class ReverseStringMaintainingSpaces {
	
	public static String reverseWithSpaces(String inputString) {
		
		String output="";
		for(int i=0;i<inputString.length();i++) {
			
			StringBuilder temp=new StringBuilder();
			while(i<inputString.length()&&inputString.charAt(i)!=' ') {
				temp=temp.append(inputString.charAt(i));
				i++;
			}
			output=output+temp.reverse();//reverse method is avail in string builder only
			
			if(i<inputString.length()&&inputString.charAt(i)==' ') {
				output+=" ";
				continue;
			}
		}
		return output;
		
		
	}


	private static String reverseStringMaintainingSpecialCharacters(String input){
		char[] inputArray=input.toCharArray();
		int left=0;
		int right=inputArray.length-1;

		while(left<right&&left<inputArray.length-1&&right>=0){
				if(!Character.isAlphabetic(inputArray[left]))
					left++;
				else if(!Character.isAlphabetic(inputArray[right]))
					right--;
				else{
					char temp=inputArray[left];
					inputArray[left]=inputArray[right];
					inputArray[right]=temp;
					left++;
					right--;

				}
		}
		return new String(inputArray);
	}

	
	
	public static void main(String[] args) {
		String inputString="12 546   789";
		String output=reverseWithSpaces(inputString);
		System.out.println("Input String     :"+inputString);
		System.out.println("Reversed String  :"+output);

		String str = "a!!!b.c.d,e'f,ghi";
		System.out.println("Input string with special characters: "+str);
		System.out.println("Reversed string after maintaining special characters:"+reverseStringMaintainingSpecialCharacters(str));
	}

}
