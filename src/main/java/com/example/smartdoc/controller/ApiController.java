package com.example.smartdoc.controller;

import com.example.smartdoc.dao.KongDao;
import com.example.smartdoc.model.KongModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ApiController {

    @Autowired
    private KongDao kongDao;

    @PostMapping("/getDetail")
    public Object getDetail(KongModel kongModel){

        kongDao.insert(kongModel);
        return "ok";

    }


}
