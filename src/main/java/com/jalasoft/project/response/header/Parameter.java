package com.jalasoft.project.response.header;

import com.jalasoft.project.exceptions.ParameterInvalidException;

import java.io.File;

/**
 * @author HP
 * @version 1.1
 */
public abstract class Parameter {
    protected File file;

    public Parameter(File file) {
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public abstract void validate() throws ParameterInvalidException,
            ParameterInvalidException, ParameterInvalidException,
            ParameterInvalidException;
}
