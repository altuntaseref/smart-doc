package com.example.smartdoc.entity;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "ENTEGRATION_FLOWT")
public class EntegrationFlowTest {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "prodUrl",unique = true,nullable = false)
    private String prodUrl;
    @Column(name = "kongUrl",unique = true,nullable = false)
    private String kongUrl;
    @Column(name = "prodUsername",unique = true,nullable = false)
    private String prodUsername;
    @Column(name = "uatUsername",unique = true,nullable = false)
    private String uatUsername;
    @Column(name = "uatUrl",unique = true,nullable = false)
    private String uatUrl;
    @Column(name = "uatKongUrl",unique = true,nullable = false)
    private String uatKongUrl;
    @Column(name = "flow",unique = true,nullable = false)
    private String flow;
    @Column(name = "appName",unique = true,nullable = false)
    private String appName;


}
