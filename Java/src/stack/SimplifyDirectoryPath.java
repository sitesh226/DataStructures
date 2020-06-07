package stack;

import java.util.Stack;

/*
 *Given an absolute path for a file (Unix-style), simplify it.
 * Note that absolute path always begin with ‘/’ ( root directory ),
 *  a dot in path represent current directory and double dot represents parent directory.
 */
public class SimplifyDirectoryPath {


    private static String getSimplifiedPath(String input){
        String[] inputArray=input.split("/");
        Stack<String> stack=new Stack<>();

        for(String s:inputArray){
            if(s.equals(".")||s.equals(""))
                continue;
            else if(s.equals("..")){
                if(!stack.isEmpty())
                        stack.pop();
            }else{
                stack.push(s);

            }
        }

        StringBuilder result=new StringBuilder();
        while(!stack.isEmpty()){
            result.insert(0,stack.pop());
            result.insert(0,"/");
        }

        return result.length()!=0?result.toString():"/";
    }

    public static void main(String[] args) {
        String str = new String("/a/./b/../../c/d/");
        System.out.println("Simplified path:"+getSimplifiedPath(str));
    }
}


