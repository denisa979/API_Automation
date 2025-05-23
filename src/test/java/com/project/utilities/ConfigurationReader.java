package com.library.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Properties;

public class ConfigurationReader {

    //Create properties object
    //We make this private to be inaccessible from outside
    //make static because static runs first and before everything else
    //We will use this object under static method

    private static Properties properties = new Properties();

    //having static block because static runs first

    static {
        try {
            //Create FileInputStream object to open file as a stream in java memory
            FileInputStream file = new FileInputStream("configuration.properties");
            //Load "properties" file object with the :file" we opened using FieInputStream
            properties.load(file);

        }catch (IOException e){
            System.out.println("File not found in ConfigurationReader class");
        }
    }
    public static String getProperty(String keyword){
    return properties.getProperty(keyword);}
}
