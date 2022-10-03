package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfgReader {

    public static Properties properties;

    static {// her method dan once calisir

        String dosyaYolu = "confguration.properties";
        try {
            FileInputStream fis = new FileInputStream(dosyaYolu);
            properties = new Properties();
            properties.load(fis);// fis'in okudugu bilgileri properties'e yukledi

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getProperty(String key){
         /*
        test metodundan yolladığımız string key değerini alıp
        Properties class'ından getProperty() methodunu kullanarak
        bu key'e ait value'yu bize getirir
         */

        return properties.getProperty(key);
    }
}
