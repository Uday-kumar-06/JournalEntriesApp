package com.webCof.uniqueApp.repository;

import com.webCof.uniqueApp.entity.JournalEntry;
import com.webCof.uniqueApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//controller ---> service --> repository
public interface UserRepository extends MongoRepository<User, ObjectId> {

    User findByUserName(String userName);
    void deleteByUserName(String userName);
}
