package com.example.smartdoc.controller;

import com.codoid.products.exception.FilloException;
import com.example.smartdoc.service.KongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    private KongService kongService;

    @PostMapping("/appDetail")
    public Object getAppDetail(String appName) throws FilloException {
        return kongService.findApp(appName);
    }
}
