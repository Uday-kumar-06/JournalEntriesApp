package com.webCof.uniqueApp.repository;

import com.webCof.uniqueApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

//controller ---> service --> repository
public interface JournalEntryRepository extends MongoRepository<JournalEntry, ObjectId> {

}
