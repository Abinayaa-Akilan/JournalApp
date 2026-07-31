package com.journal.journalApp.controller;

import com.journal.journalApp.entity.JournalEntry;
import com.journal.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.*;
@RestController
@RequestMapping("/heyy")
public class journalEntryControllerV2 {
    @Autowired
    private JournalEntryService journalEntryService;
    @GetMapping
    public List<JournalEntry> getAll(){
        return journalEntryService.getAll();
    }
    @PostMapping
    public ResponseEntity<JournalEntry> creatEntry(@RequestBody JournalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return new ResponseEntity<>(myEntry,HttpStatus.CREATED);
    }
    @GetMapping("id/{myId}")
    public ResponseEntity<Optional<JournalEntry>> getJournalEntryById(@PathVariable ObjectId Id){
        Optional<JournalEntry> temp  = journalEntryService.FindJournalById(Id);
        if(temp.isPresent()) {
            return new ResponseEntity<>(temp, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("id/{Id}")
    public List<JournalEntry> deleteJournalEntryById(@PathVariable ObjectId Id) {
        journalEntryService.DelJournalEntryById(Id);
        return journalEntryService.getAll();
    }

    @PutMapping("id/{Id}")
    public JournalEntry updateJournalEntry(@PathVariable ObjectId Id, @RequestBody JournalEntry jr) {
        Optional<JournalEntry> temp = journalEntryService.FindJournalById(Id);
        if(temp.isPresent()) {
            temp.get().setTitle(jr.getTitle());
            temp.get().setContent(jr.getContent());
            return temp.orElse(null);
        }
        return null;
    }
}
