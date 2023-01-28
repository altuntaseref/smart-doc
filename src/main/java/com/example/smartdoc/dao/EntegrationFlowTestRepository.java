package com.example.smartdoc.dao;

import com.example.smartdoc.entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EntegrationFlowTestRepository extends JpaRepository< EntegrationFlowTest,Integer> {

EntegrationFlowTest findAllByAppName(String name);

}
