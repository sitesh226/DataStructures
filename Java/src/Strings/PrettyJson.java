package Strings;

public class PrettyJson {

    private static String getPrettyJson(String input){
        String copy="";
        int openBraces=0;
        int closedBraces=0;
        for (int i=0;i<input.length();i++){

            if(input.charAt(i)=='{'||input.charAt(i)=='['){
                //For after :
                if(i>=2&&input.charAt(i-1)==':'){
                    copy+="\n";
                    int j=0;
                    while(j<openBraces-closedBraces) {
                        copy += "\t";
                        j++;
                    }
                }
                copy+=input.charAt(i)+"\n";
                openBraces++;
                int j=0;
                while(j<openBraces-closedBraces) {
                    copy += "\t";
                    j++;
                }
            }

            else  if(input.charAt(i)=='}'||input.charAt(i)==']'){
                copy+="\n";
                closedBraces++;
                int j=0;
                while(j<openBraces-closedBraces) {
                    copy += ("\t");
                    j++;
                }

                copy+=(input.charAt(i));
            }
            else if(input.charAt(i)==','){
                copy+=(",\n");
                int j=0;
                while(j<openBraces-closedBraces) {
                    copy += ("\t");
                    j++;
                }


            }else{
                copy+=(input.charAt(i));
            }

        }

        return copy;

    }

    public static void main(String[] args) {
        //String s = "{\"attributes\":[{\"nm\":\"ACCOUNT\",\"lv\":[{\"v\":{\"Id\":null,\"State\":null},\"vt\":\"java.util.Map\",\"cn\":1}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":13585},{\"nm\":\"PROFILE\",\"lv\":[{\"v\":{\"Party\":null,\"Ads\":null},\"vt\":\"java.util.Map\",\"cn\":2}],\"vt\":\"java.util.Map\",\"status\":\"SUCCESS\",\"lmd\":41962}]}";
        String s = "{A:\"B\",C:{D:\"E\",F:{G:\"H\",I:\"J\"}}}";
        System.out.println(getPrettyJson(s));
    }
}
