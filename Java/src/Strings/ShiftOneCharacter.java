package Strings;
/*
Given a string, you need to return a new string where every letter is shifted to its right by one place in alphabetical order.
The last letters z and Z should be replaced with the first ones: a and A, respectively.
If the character isn't a letter, it should stay the same.
It is not allowed to use string built-in methods here.
For example, given the string "abc123XYz!", the function should return "bcd123YZa!".
 */
public class ShiftOneCharacter {

        public String shiftByOneCharacter(String s) {
            String output="";

            for(int i=0;i<s.length();i++){
                int currentCharAscii= s.charAt(i);

                if(currentCharAscii>=65&&currentCharAscii<90)
                    output+=(char)(currentCharAscii+1);
                else if(currentCharAscii>=97&&currentCharAscii<122)
                    output+=(char)(currentCharAscii+1);
                else if(currentCharAscii==90)
                    output+="A";
                else if(currentCharAscii==122)
                    output+="a";
                else
                    output+=(char)currentCharAscii;


            }

            System.out.println(output);
            return output;
        }

    public static void main(String[] args) {
        ShiftOneCharacter shiftOneCharacter= new ShiftOneCharacter();
        shiftOneCharacter.shiftByOneCharacter("beA$56Z");
    }
}
