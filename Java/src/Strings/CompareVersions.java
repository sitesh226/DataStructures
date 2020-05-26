package Strings;

/*
*V1 = “1.0.31”
*V2 = “1.0.27”
*Then V2 version is latest (or smaller) because V2 < V1
*
 */
public class CompareVersions {

    private static void getSmallerVersion(String v1,String v2){

        String v11=v1;
        String v22=v2;
        if(v1.length()!=v2.length()) {
            if (v1.length() > v2.length()) {
                v11 = v1.substring(0, v2.length());
            } else
                v22 = v2.substring(0, v1.length());
        }

        v11=v11.replaceAll("\\.","");
        v22=v22.replaceAll("\\.","");

        if(Integer.parseInt(v11)>Integer.parseInt(v22))
            System.out.println("Smaller version: "+v2);
        else if(Integer.parseInt(v11)<Integer.parseInt(v22))
            System.out.println("Smaller version: "+v1);
        else
            System.out.println("Both versions are equal");
    }

    public static void main(String[] args) {
        String version1 = "1.0.33";
        String version2 = "1.0.31.4";
        getSmallerVersion(version1,version2);
    }
}
