package Strings;

public class TestEquality {

    public static int testTryCatchFinally(){
        try{
            return 10;
        }catch (Exception e){

        }finally {
            return 20;
        }
    }


    public static void testStringSplit(String input){
        String[] arr=input.split("\\.");
        for (String str:arr) {
            System.out.println(str);

        }
        System.out.println(arr.length);
    }


    public static void main(String[] args){

        //StringBuffer does not override equals method of object class so on using equals references are checked.
//        StringBuffer sb1 = new StringBuffer("Amit");
//        StringBuffer sb2 = new StringBuffer("Amit");
//        String ss1 = "Amit";
//        String ss2="Amit";
//        String ss3=new String("Amit");
//        System.out.println(sb1==sb2);
//        System.out.println(sb1.equals(sb2));
//        System.out.println(sb1.equals(ss1));
//        System.out.println(ss1.equals(ss2));
//        System.out.println(ss1==ss2);
//        System.out.println(ss1==ss3);
//        System.out.println(ss1.equals(ss3));
//
//
//        System.out.println("Poddar".substring(3));
//
//        //
//        String s = "Hello  ";
//        s+= "aaaa  ";
//        s=s.trim();
//        System.out.println(s);
//
//        TestEquality equality=new TestEquality();
//        System.out.println(TestEquality.testTryCatchFinally());

        TestEquality.testStringSplit(".123.43.6");
    }
}
