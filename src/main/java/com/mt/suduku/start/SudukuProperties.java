package com.mt.suduku.start;

import com.mt.suduku.exception.SudukuBug;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Properties;

/**
 * Created by root on 12/01/17.
 */
public class SudukuProperties {
    private final Properties properties = new Properties();

    public SudukuProperties() throws IOException {
        final String path = "src/main/resources/sudoku.properties";
        properties.load(new FileInputStream(path));
        System.out.println(Arrays.toString(properties.keySet().toArray()));
    }

    public String getProperty(Class clazz, String name) {
        final String key = String.format("%s.%s", clazz.getName(), name);
        if (properties.containsKey(key))
            return properties.getProperty(key).toString();
        else
            throw new SudukuBug(String.format("No property by the key of [%s]", key));
    }
}
