package com.jalasoft.project.properties;

import com.jalasoft.project.exceptions.*;
import com.jalasoft.project.response.ExecuteCommand;
import com.jalasoft.project.response.FileService;
import com.jalasoft.project.response.header.ICommandBuilder;
import com.jalasoft.project.response.header.JavaCommand;
import com.jalasoft.project.response.header.JavaParameter;
import com.jalasoft.project.response.request.RequestParam;
import com.jalasoft.project.response.response.OKResponse;
import com.jalasoft.project.response.response.Response;
import com.jalasoft.project.response.response.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.File;

/**
 * @author HP
 * @version 1.1
 */
@RestController
@RequestMapping("/api/v1")
public class ExecuteController {

    @Autowired
    private JavaPropertiesHadle javaProperties;

    @Autowired
    private FileService fileService;

    @PostMapping("/execute-java")
    public ResponseEntity<Response> execute(RequestParam param) {
        try {
            param.validate();

            File javaFile = this.fileService.store(param.getFile(), this.javaProperties.getProjectFolder());
            String javaPath = this.javaProperties.getLanguageFolder(param.getVersion());

            ICommandBuilder<JavaParameter> commandBuilder = new JavaCommand();

            String command = commandBuilder.buildCommand(new JavaParameter(javaPath, javaFile));
            ExecuteCommand executeCommand = new ExecuteCommand();
            Result result = executeCommand.execute(command);

            return ResponseEntity.ok().body(
                    new OKResponse<Integer>(HttpServletResponse.SC_OK, result.getResultConsole(), result.getPid())
            );
        } catch (RequestParamException|FileException | PropertyException ex) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse<Integer>(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage())
            );
        } catch (ParameterInvalidException | CommandException | ExecuteException ex) {
            return ResponseEntity.badRequest().body(
                    new ErrorResponse<Integer>(HttpServletResponse.SC_BAD_REQUEST, ex.getMessage())
            );
        }
    }
}
