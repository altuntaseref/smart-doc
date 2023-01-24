package com.example.smartdoc.entity;

import javax.persistence.*;


@Entity
@Table(name = "KONG_IDENTIFICATION")
public class KongEntity {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "appName",unique = true,nullable = false)
    private String appName;
    @Column(name = "prodLink",unique = true)
    private String prodLink;
    @Column(name = "prodKongLink",unique = true)
    private String prodKongLink;
    @Column(name = "prodUsername",unique = true)
    private String prodUsername;
    @Column(name = "prodPassword",unique = true)
    private String prodPassword;
    @Column(name = "uatLink",unique = true)
    private String uatLink;
    @Column(name = "uatKongLink",unique = true)
    private String uatKongLink;
    @Column(name = "uatUsername")
    private String uatUsername;
    @Column(name = "uatPassword")
    private String uatPassword;


}
