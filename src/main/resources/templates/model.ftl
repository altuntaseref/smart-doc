package com.example.smartdoc.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "${tableName}")
public class ${className} {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
<#list fieldNameList as fieldName>
    @Column(name = "${fieldName}",unique = true,nullable = false)
    private String ${fieldName};
</#list>


}
