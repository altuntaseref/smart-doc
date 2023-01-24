package com.example.smartdoc.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class ProdEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "directory",nullable = false)
    private String directory;
    @Column(name = "portNumber",nullable = false,unique = true)
    private int portNumber;

}
