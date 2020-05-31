package Strings;

public class CheckPalindrome {

    private static boolean isPalindrome(String input){
        StringBuilder copy=new StringBuilder();
        for (int i=0;i<input.length();i++){
            if(Character.isLetterOrDigit(input.charAt(i)))
                copy.append(input.charAt(i));
        }

        String formattedInput=copy.toString();
        return new StringBuilder(formattedInput).reverse().toString().equalsIgnoreCase(formattedInput);

    }

    public static void main(String[] args) {
        String input="A man, a plan, a canal: Panama";
        System.out.println("String ---"+input+ "--- is palindrome : "+isPalindrome(input) );
    }
}
