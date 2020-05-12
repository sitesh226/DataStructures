package PropertiesReadWrite;

import java.io.*;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;


/**
 * Class reads properties from RootProperties file and creates 2 property files,
 * one to store properties starting with vowels and other to store properties
 * starting with consonants
 *
 */

public class FilterProperties {

    public static void main(String[] args) throws IOException,NullPointerException {

        FileReader reader=new FileReader("C:\\RestAssured\\Java\\src\\PropertiesReadWrite\\RootProperties.properties");

        //Create output property files
        File vowelFile = new File("C:\\RestAssured\\Java\\src\\PropertiesReadWrite\\vowelProperties.properties");
        vowelFile.getParentFile().mkdirs(); // Will create parent directories if not exists
        vowelFile.createNewFile();
        FileOutputStream vowelOutPutStream = new FileOutputStream(vowelFile,false);
        Properties vowelProperties=new Properties();

        File consonantFile = new File("C:\\RestAssured\\Java\\src\\PropertiesReadWrite\\consonantProperties.properties");
        consonantFile.getParentFile().mkdirs(); // Will create parent directories if not exists
        consonantFile.createNewFile();
        FileOutputStream consonantOutPutStream = new FileOutputStream(consonantFile,false);
        Properties consonantProperties= new Properties();

        //Read properties from root properties file
        Properties readProperties=new Properties();
        readProperties.load(reader);

        Set propertySet=readProperties.entrySet();
        Iterator iterator=propertySet.iterator();
        while(iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
          //  System.out.println(entry.getKey()+" = "+entry.getValue());
            char keyStartCharacter=entry.getKey().toString().charAt(0);
            if(keyStartCharacter=='a'||keyStartCharacter=='e'||keyStartCharacter=='i'||keyStartCharacter=='o'||keyStartCharacter=='u'){
                    vowelProperties.setProperty(entry.getKey().toString(), entry.getValue().toString());

            }else
                    consonantProperties.setProperty(entry.getKey().toString(), entry.getValue().toString());
        }

        vowelProperties.store(vowelOutPutStream,"Appended vowel properties file");
        consonantProperties.store(consonantOutPutStream,"Appended consonant properties file");
        vowelOutPutStream.close();
        consonantOutPutStream.close();
    }
}
