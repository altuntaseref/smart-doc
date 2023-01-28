package com.example.smartdoc.model;

import lombok.Data;

import java.util.List;

@Data
public class EntityGeneratorModel {
    private String tableName;
    private String appName;
    private List<String> fieldName;
}
