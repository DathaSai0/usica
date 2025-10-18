package com.usica.usica.repository;

import com.usica.usica.model.Tag;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface TagRepo extends MongoRepository<Tag , String> {
    Optional<Tag> findByType(String type);
}
