package edu.matc.persistence;

import java.io.*;
import java.util.*;

/**
 * This interface contains a default method that can be used anywhere a Properties
 * object is needed to be loaded.
 *
 */
public interface PropertiesLoaderInterface {

    /**
     * This default method will load a properties file into a Properties instance
     * and return it.
     * @return a populated Properties instance or an empty Properties instance if
     * the file path was not found.
     */
    default Properties loadProperties(){
        Properties properties = new Properties();
        try {
            properties.load (this.getClass().getResourceAsStream("/database.properties"));
        } catch (IOException ioe) {
            System.out.println("Database.loadProperties()...Cannot load the properties file");
            ioe.printStackTrace();
        } catch (Exception e) {
            System.out.println("Database.loadProperties()..." + e);
            e.printStackTrace();
        }
        return properties;
    }
}