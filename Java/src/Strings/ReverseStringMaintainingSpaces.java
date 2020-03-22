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
			output=output+temp.reverse();
			
			if(i<inputString.length()&&inputString.charAt(i)==' ') {
				output+=" ";
				continue;
			}
		}
		return output;
		
		
	}
	
	
	public static void main(String[] args) {
		String inputString="12 546   789";
		String output=reverseWithSpaces(inputString);
		System.out.println("Input String     :"+inputString);
		System.out.println("Reversed String  :"+output);
	}

}
