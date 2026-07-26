package com.journal.journalApp.repository;

import com.journal.journalApp.entity.JournalEntry;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JournalEntryRepo extends MongoRepository<JournalEntry,ObjectId>{

}
