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

    public static void main(String[] args){

        //StringBuffer does not override equals method of object class so on using equals references are checked.
        StringBuffer sb1 = new StringBuffer("Amit");
        StringBuffer sb2 = new StringBuffer("Amit");
        String ss1 = "Amit";
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
        System.out.println(sb1.equals(ss1));
        System.out.println("Poddar".substring(3));

        //
        String s = "Hello  ";
        s+= "aaaa  ";
        s=s.trim();
        System.out.println(s);

        TestEquality equality=new TestEquality();
        System.out.println(TestEquality.testTryCatchFinally());
    }
}
