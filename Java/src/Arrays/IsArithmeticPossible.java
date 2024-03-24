package Arrays;

public class IsArithmeticPossible {

    boolean solution(int a, int b, int c) {

        if((a+b)==c){
            System.out.println(a+b);
            return true;
        }


        if((a-b)==c){
            System.out.println(a-b);
            return true;
        }
        if((a*b)==c){
            System.out.println(a*b);
            return true;
        }
        if((a/b)==c&& a%b==0){
            System.out.println(a/b);
            return true;
        }


        return false;

    }


    public static void main(String[] args) {
        IsArithmeticPossible isPossible=new IsArithmeticPossible();
        isPossible.solution(8,3,2);
    }

}
