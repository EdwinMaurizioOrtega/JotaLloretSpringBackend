package com.bezkoder.spring.data.mongodb.repository;

import com.bezkoder.spring.data.mongodb.model.Polla;
import com.bezkoder.spring.data.mongodb.model.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface PollaRepository extends MongoRepository<Polla, String> {
//  List<Polla> findByPublished(boolean published);
//  List<Polla> findByTitleContaining(String title);
}
