package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.openxml4j.exceptions.InvalidOperationException;

public class ConfigReader {

private Properties prop;
    
    public Properties init_prop() {
    	
    	 prop = new Properties();
         try {
             FileInputStream ip = new FileInputStream("./src/test/resources/config/config.properties");
             prop.load(ip);


       } catch (FileNotFoundException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         
         catch(InvalidOperationException e) {
     		e.printStackTrace();
     	}
         catch(NullPointerException e) {
         e.printStackTrace();
    }
         catch(IllegalArgumentException e) {
        	 e.printStackTrace();
         }
         catch(IllegalStateException e) {
        	 e.printStackTrace();
         }
         
         
         return prop;  
    }
    	
    }