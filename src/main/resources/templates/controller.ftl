package com.example.smartdoc.controller;

import com.example.smartdoc.entity.*;
import com.example.smartdoc.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/")
public class ${appName}Controller {

@Autowired
private ${appName}Repository dao;

@PostMapping("/${appName}")
public Object getFindAll(String appName) {
    return dao.findAllByAppName(appName);
}

}
