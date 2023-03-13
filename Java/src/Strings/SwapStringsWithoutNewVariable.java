package Strings;

public class SwapStringsWithoutNewVariable {

    public static void main(String[] args) {
        String s1="abc";
        String s2="def";
        s1=s1+" "+s2;
        s2=s1.replace(s2,"").replace(" ","");
        s1=s1.substring(s1.indexOf(" ")+1,s1.length());
        System.out.println("S1:" +s1+ "\n"+"S2:"+s2);
    }
}
