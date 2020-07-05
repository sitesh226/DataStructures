package Strings;

import java.util.Arrays;
/*
*ABCD, 2 can be written as
A....C
...B....D
 */

public class ZigZagStringsInNRows {

    private static String getZigZagStringInNRows(String input, int rows){
        if(rows==1)
            return input;
        int currentRow=0;
        String[] resultArray=new String[rows];
        Arrays.fill(resultArray, "");

        boolean moveDown=true;
        for (int i=0;i<input.length();i++){
            resultArray[currentRow]+=input.charAt(i);
            if(currentRow==rows-1){
                moveDown=false;
            }
            if(currentRow==0){
                moveDown=true;
            }
            if(moveDown){
                currentRow++;
            }else{
                currentRow--;
            }

        }

        String result="";
        for (String s:resultArray){
            result+=s;
        }
        return result;
    }

    public static void main(String[] args) {
        String input="GEEKSFORGEEKS";
        System.out.println("Input string in zigzag manner:"+getZigZagStringInNRows(input,3));
    }
}
