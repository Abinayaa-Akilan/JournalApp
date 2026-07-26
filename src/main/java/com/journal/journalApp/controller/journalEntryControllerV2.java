package com.journal.journalApp.controller;

import com.journal.journalApp.entity.JournalEntry;
import com.journal.journalApp.service.JournalEntryService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
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
    public boolean creatEntry(@RequestBody JournalEntry myEntry){
        myEntry.setDate(LocalDateTime.now());
        journalEntryService.saveEntry(myEntry);
        return true;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable ObjectId Id){
        return journalEntryService.AddJournalEntryById(Id).orElse(null);
    }

    @DeleteMapping("id/{Id}")
    public List<JournalEntry> deleteJournalEntryById(@PathVariable ObjectId Id) {
        journalEntryService.DelJournalEntryById(Id);
        return journalEntryService.getAll();
    }

    @PutMapping("id/{Id}")
    public JournalEntry updateJournalEntry(@PathVariable ObjectId Id, @RequestBody JournalEntry jr) {
        JournalEntry temp = journalEntryService.AddJournalEntryById(Id).orElse(null);
        if(temp!=null) {
            temp.setTitle(jr.getTitle());
            temp.setContent(jr.getContent());
            return temp;
        }
        return null;
    }
}
