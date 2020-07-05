package stack;

/*
*
* Given a string of balanced expression, find if it contains a redundant parenthesis or not.
*  A set of parenthesis are redundant if same sub-expression is surrounded by unnecessary or multiple brackets
 */

import java.util.Stack;

public class RedundantBraces {

    private static boolean isRedundantBracesPresent(String inputExpression){

        Stack<Character> stack=new Stack<>();
        char[] inputArray=inputExpression.toCharArray();
        for(char c:inputArray){
            if(c==')'){
                char top=stack.peek();
                stack.pop();
                // If immediate pop have open parenthesis '('
                // duplicate brackets found
                boolean flag=true;
                while(top!='('){
                    // Check for operators in expression
                    if(top=='+'||top=='-'||top=='*'||top=='/'){
                        flag=false;
                    }
                    top=stack.peek();
                    stack.pop();
                }
                // If operators not found
                if(flag==true)
                    return true;
            }else{
                stack.push(c);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "(a + (a + b))";
        System.out.println("Is redundant braces present:"+isRedundantBracesPresent(str));
    }
}
