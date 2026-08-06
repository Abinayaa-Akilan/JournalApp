package com.journal.journalApp.repository;

import com.journal.journalApp.entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserEntryRepo extends MongoRepository<User,ObjectId>{
    User findUserByName(String username);
}
