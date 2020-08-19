package com.jalasoft.project.controller;

import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @author HP
 * @version 1.1
 */
@RestController
public  abstract class BuildRequest {
    Gson gson = new Gson();

}