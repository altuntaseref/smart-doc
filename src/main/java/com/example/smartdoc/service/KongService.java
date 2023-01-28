package com.example.smartdoc.service;

import com.example.smartdoc.dao.*;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KongService {

    @Autowired
    private KongRepository kongRepository;

    public Object findApp(String appName)  {
        return kongRepository.findAllByAppName(appName);
    }
}
