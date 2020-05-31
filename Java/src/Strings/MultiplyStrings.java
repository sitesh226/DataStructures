package Strings;

public class MultiplyStrings {

    private static String multiplyStrings(String s1,String s2){
        String s11=new StringBuilder(s1).reverse().toString();
        String s22=new StringBuilder(s2).reverse().toString();

        int [] output=new int[s11.length()+s22.length()];
        for (int i=0;i<s11.length();i++){
            for (int j=0;j<s22.length();j++){
                output[i+j]+=(s11.charAt(i)-'0')*(s22.charAt(j)-'0');

            }
        }

        StringBuilder result=new StringBuilder();
        for(int i=0;i<output.length;i++){
            int mod=output[i]%10;
            int carry=output[i]/10;
            if(carry>0){
                output[i+1]+=carry;
            }
            result.append(mod);
        }

        //remove zeroes from front:
        result.reverse();
        while(result.charAt(0)=='0'){
            result.deleteCharAt(0);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println("Multiply strings: "+multiplyStrings("12","10"));
    }
}
