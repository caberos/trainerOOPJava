package com.jalasoft.project.response.header;


import com.jalasoft.project.exceptions.CommandException;
import com.jalasoft.project.exceptions.ParameterInvalidException;

/**
 * @author HP
 * @version 1.1
 */
public class PythonCommand implements ICommandBuilder<PythonParameter> {

    public String buildCommand(PythonParameter pythonParameter) throws ParameterInvalidException,
            CommandException {
        return "ipconfig";
    }
}
