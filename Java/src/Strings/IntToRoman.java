package Strings;

public class IntToRoman {

    private static String getRomanNumber(int input){
        String[] m={"","M","MM","MMM"};
        String[] c={"","C","CC","CCC","CD","D","DC","DCC","DCCC","DM"};
        String[] x={"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String[] i = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};

        String thousand=m[input/1000];
        String hundred=c[input%1000/100];
        String tens=x[input%100/10];
        String ones=i[input%10];

        String output=thousand+hundred+tens+ones;
        return output;
    }

    public static void main(String[] args) {
        int input =3549;
        System.out.println("Roman equivalent for "+input+ " :"+getRomanNumber(input));
    }
}
