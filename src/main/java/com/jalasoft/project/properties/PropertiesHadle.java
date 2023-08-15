package com.jalasoft.project.properties;


/**
 * @author HP
 * @version 1.1
 */
public abstract class PropertiesHadle {
    private String projectFolder;

    public String getProjectFolder() {
        return projectFolder;
    }

    public void setProjectFolder(String projectFolder) {
        this.projectFolder = projectFolder;
    }

    public abstract String getLanguageFolder(String version) throws Exception;
}
