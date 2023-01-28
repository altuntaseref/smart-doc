package com.example.smartdoc.dao;

import com.example.smartdoc.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ${appName}Repository extends JpaRepository< ${appName},Integer> {

${appName} findAllByAppName(String name);

}
