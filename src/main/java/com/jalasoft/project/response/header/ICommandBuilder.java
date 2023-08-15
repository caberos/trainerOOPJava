package com.jalasoft.project.response.header;


import com.jalasoft.project.exceptions.CommandException;
import com.jalasoft.project.exceptions.ParameterInvalidException;

public interface ICommandBuilder<T extends Parameter> {
    String buildCommand(T parameter) throws ParameterInvalidException,
            CommandException;
}
