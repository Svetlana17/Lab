package Prototypes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SinglitonProperties {

    private  static SinglitonProperties singlitonProperties;
    private  static Properties properties;

    private SinglitonProperties(){

    }
    public static Properties getProperties() {
        if (properties == null) {
            properties = new Properties();
            try {
                FileInputStream fileInputStream = new FileInputStream("src/main/resources/singliton.properties");
                properties.load(fileInputStream);
                System.out.println(properties.getProperty("Function"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return properties;
    }
}
