package SystemProperties;

import java.util.Properties;
import java.util.Set;

public class ReadSystemProperties {

    public static void main(String[] args){
        Properties properties=System.getProperties();
        Set<Object> propertySet=properties.keySet();

        for(Object prop:propertySet){
            System.out.println("Property :"+prop.toString()+ "  :"+System.getProperty(prop.toString()));
        }
    }
}
