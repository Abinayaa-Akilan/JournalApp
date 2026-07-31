package com.journal.journalApp.service;

import com.journal.journalApp.entity.JournalEntry;
import com.journal.journalApp.repository.JournalEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JournalEntryService{
    @Autowired
    private JournalEntryRepo journalEntryRepo;

    public void saveEntry(JournalEntry JP) {
        journalEntryRepo.save(JP);
    }
    public List<JournalEntry> getAll() {
        return journalEntryRepo.findAll();
    }
    public Optional<JournalEntry> FindJournalById(ObjectId Id){
        return journalEntryRepo.findById(Id);
    }
    public void AddJournalEntryById(JournalEntry JP) {
        journalEntryRepo.save(JP);
    }
    public void DelJournalEntryById(ObjectId Id) {
        journalEntryRepo.deleteById(Id);
    }
}
