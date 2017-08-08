package me.xueyao.classloader;

import java.io.FileReader;
import java.util.Properties;

/**
 * @author Yao Xue
 * @date Aug 7, 2017 6:46:45 PM
 */
public class PartyFactory {
    private static Properties prop = new Properties();
    
    static {
        try {
            prop.load(new FileReader("party.properties"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Singable getSingable() throws Exception {
        String className = prop.getProperty("singable");
        Class<?> cls = Class.forName(className);
        return (Singable) cls.newInstance();
    }
}
