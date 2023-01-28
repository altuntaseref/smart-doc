package com.example.smartdoc.dao;

import com.example.smartdoc.entity.KongEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KongRepository extends JpaRepository<KongEntity,Integer> {

    KongEntity findAllByAppName(String name);

}
