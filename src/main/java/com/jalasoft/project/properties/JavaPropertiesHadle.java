package com.jalasoft.project.properties;

import com.jalasoft.project.exceptions.PropertyException;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author HP
 * @version 1.1
 */
@Component
@ConfigurationProperties(prefix = "execute.java")
public class JavaPropertiesHadle extends PropertiesHadle {
    private String javaVersion = " ";

    public String getJavaVersion() {
        return javaVersion;
    }

    public String getLanguageFolder(String version) throws PropertyException {
        if (version.equals(javaVersion)) {
            return javaVersion;
        } else {
            throw new PropertyException("invalid java version");
        }
    }
}
