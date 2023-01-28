package com.example.smartdoc.dao;

import com.example.smartdoc.model.KongModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KongDao extends MongoRepository<KongModel,Integer> {

}
