package com.example.smartdoc;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
public class KongModel {

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
