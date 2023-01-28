package com.example.smartdoc.model;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Document
public class KongModel {

    private int id;
    private String appName;
    private String prodLink;
    private String prodKongLink;
    private String prodUsername;
    private String prodPassword;
    private String uatLink;
    private String uatKongLink;
    private String uatUsername;
    private String uatPassword;
}
