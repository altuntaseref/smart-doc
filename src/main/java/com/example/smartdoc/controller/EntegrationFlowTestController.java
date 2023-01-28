package com.example.smartdoc.controller;

import com.example.smartdoc.entity.*;
import com.example.smartdoc.dao.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1/")
public class EntegrationFlowTestController {

@Autowired
private EntegrationFlowTestRepository dao;

@PostMapping("/EntegrationFlowTest")
public Object getFindAll(String appName) {
    return dao.findAllByAppName(appName);
}

}
