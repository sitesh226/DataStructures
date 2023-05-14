package Strings;

public class CheckSubString {
    private static int isSubString(String s1,String s2){

        int l1=s1.length();
        int l2=s1.length();

        int i=0;
        while(i<l1){
            if(s2.indexOf(s1.charAt(i))!=-1){
                i++;
            }else{
                System.out.println("Substring doesn't exist");
                return -1;
            }
        }
        System.out.println("Substring from Index:"+ s2.indexOf(s1.charAt(0)));
        return  s2.indexOf(s1.charAt(0)) ;
    }

    public static void main(String[] args) {
        String s1="for";
        String s2="geeksforgeeks";
        isSubString(s1,s2);
    }


}
