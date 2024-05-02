package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public  Properties intializeProperties() throws IOException {
    Properties properties=new Properties();
        File propFile= new File(System.getProperty("user.dir")+"/src/test/resources/config/Config.properties");
        try {
            FileInputStream fileInputStream = new FileInputStream(propFile);
            properties.load(fileInputStream);
        }
        catch (Exception e){
            e.printStackTrace();

        }
        return properties;



}}
