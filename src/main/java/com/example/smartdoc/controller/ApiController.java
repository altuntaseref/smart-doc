package com.example.smartdoc.controller;

import com.codoid.products.exception.FilloException;
import com.example.smartdoc.model.EntityGeneratorModel;
import com.example.smartdoc.service.generators.ControllerGenerator;
import com.example.smartdoc.service.generators.DaoGenerator;
import com.example.smartdoc.service.generators.EntityGenerator;
import com.example.smartdoc.service.KongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/api/v1")
public class ApiController {

    @Autowired
    private KongService kongService;


    @Autowired
    private EntityGenerator entityGenerator;

    @Autowired
    private DaoGenerator daoGenerator;
    @Autowired
    private ControllerGenerator controllerGenerator;

    @PostMapping("/appDetail")
    public Object getAppDetail(String appName) throws FilloException {

        return kongService.findApp(appName);
    }

    @PostMapping("/getGenerate")
    public Object getGenerate(EntityGeneratorModel entityGeneratorModel) throws IOException {

        controllerGenerator.execute(entityGeneratorModel);
        daoGenerator.execute(entityGeneratorModel);
        entityGenerator.execute(entityGeneratorModel);
        return "ok";
    }
}
