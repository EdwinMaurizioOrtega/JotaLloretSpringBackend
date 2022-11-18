package com.bezkoder.spring.data.mongodb.repository;

import com.bezkoder.spring.data.mongodb.model.Arbol;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArbolRepository extends MongoRepository<Arbol, String> {
//  List<Polla> findByPublished(boolean published);
//  List<Polla> findByTitleContaining(String title);
}
