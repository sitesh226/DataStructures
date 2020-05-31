package Strings;

import java.util.ArrayList;

public class GetValidIpAddresses {

    private static void getValidIpAddresses(String input){
        ArrayList<String> result=new ArrayList<>();
        int length=input.length();
        for (int i=0;i<4&&i<length-2;i++){
            for (int j=i+1;j<i+4&&j<length-1;j++){
                for (int k=j+1;k<j+4&&k<length;k++){
                    String s1=input.substring(0,i);
                    String s2=input.substring(i,j);
                    String s3=input.substring(j,k);
                    String s4=input.substring(k,length);

                    if(isValid(s1)&&isValid(s2)&&isValid(s3)&&isValid(s4))
                        result.add(s1+"."+s2+"."+s3+"."+s4);
                }
            }
        }
        System.out.println("Valid ip addresses:"+result);
    }

    private static boolean isValid(String s){
        if(s.length()>3||s.isEmpty()||s.charAt(0)=='0'||Integer.parseInt(s)>255)
            return false;
        return true;
    }

    public static void main(String[] args) {
        getValidIpAddresses("25525511135");
    }
}
