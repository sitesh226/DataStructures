package Strings;

public class AddBinaryStrings {

    private static String addBinaryStrings(String s1,String s2){
        int carry=0;
        StringBuilder resultString=new StringBuilder();
        int index1=s1.length()-1;
        int index2=s2.length()-1;

        while(index1>=0&&index2>=0){

            if(s1.charAt(index1)=='1'&&s2.charAt(index2)=='1'){
                resultString.append(carry==1?0:1);
                carry=1;
            }else if(s1.charAt(index1)=='1'||s2.charAt(index2)=='1'){
                resultString.append(carry==1?0:1);
            }else{
                resultString.append(carry);
                carry=0;
            }
            index1--;
            index2--;

        }


        String remainingString=s1.length()>s2.length()?s1:s2;
        int index=Math.max(index1,index2);
        while(index>=0){
            if(remainingString.charAt(index)=='1'){
                resultString.append(carry==1?0:1);
            }else{
                resultString.append(carry);
                carry=0;

            }
            index--;
        }


        if(carry>0)
            resultString.append(carry);

        return resultString.reverse().toString();

    }

    public static void main(String[] args) {
        String s1="1001";
        String s2="11";

        System.out.println("Result of addition of binary strings :"+ addBinaryStrings(s1,s2));

    }
}
