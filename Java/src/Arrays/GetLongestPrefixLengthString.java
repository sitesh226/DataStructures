package Arrays;

public class GetLongestPrefixLengthString {
	
	 public static void main(String[] args)
	 {
	 String[] strArr={"java2blog","javaworld","javabean","javatemp"};
	 String longestPrefix=getLongestCommonPrefix(strArr);
	 System.out.println("Longest Prefix : "+longestPrefix);
	 }

	private static String getLongestCommonPrefix(String[] strArr) {
		
		String minLenthString=getMinString(strArr);
		int minLenth=minLenthString.length();
		
		for(int i=0;i<strArr.length;i++) {
			
			int j;
			for( j=0;j<minLenth;j++) {
				if(minLenthString.charAt(j)!=strArr[i].charAt(j))
				{
					break;
				}
			}
			if(j<minLenth)
				minLenth=j;
		}
		return minLenthString.substring(0, minLenth);
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
