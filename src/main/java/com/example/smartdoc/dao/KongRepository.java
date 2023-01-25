package com.example.smartdoc.dao;

import com.example.smartdoc.entity.KongEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KongRepository extends JpaRepository<KongEntity,Integer> {

    KongEntity findAllByAppName(String name);

}
