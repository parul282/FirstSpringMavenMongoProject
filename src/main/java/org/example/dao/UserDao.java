package org.example.dao;

import org.example.model.UserDetail;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface UserDao extends MongoRepository<UserDetail, String> {
}
