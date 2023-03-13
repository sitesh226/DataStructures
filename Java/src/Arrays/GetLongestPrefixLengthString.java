package Arrays;

public class GetLongestPrefixLengthString {
	
	 public static void main(String[] args)
	 {
	 String[] strArr={"java2blog","javaworld","javabean","javatemp"};
	 String longestPrefix=getLongestCommonPrefix(strArr);
	 System.out.println("Longest Prefix : "+longestPrefix);
	 }

	private static String getLongestCommonPrefix(String[] strArr) {
		
		String minLengthString=getMinString(strArr);
		int minLength=minLengthString.length();
		
		for(int i=0;i<strArr.length;i++) {
			
			int j;
			for( j=0;j<minLength;j++) {
				if(minLengthString.charAt(j)!=strArr[i].charAt(j))
				{
					break;
				}
			}
			if(j<minLength)
				minLength=j;
		}
		return minLengthString.substring(0, minLength);
	}



	public static String minSubString(String strArr[],String minSubString){
		int i= 0;
		while(i<strArr.length){
			if(!strArr[i].contains(minSubString)&&minSubString.length()>0){
				minSubString=minSubString.substring(0,minSubString.length()-1);
				i++;
				minSubString(strArr,minSubString);
			}
		}
		return minSubString;
	}

	private static String getMinString(String[] strArr) {
		String min=strArr[0];
		for(String s: strArr) {
			if(s.length()<min.length())
				min=s;
				
		}
		return min;
	}

}
