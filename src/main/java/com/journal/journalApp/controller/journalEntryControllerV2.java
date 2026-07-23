package com.journal.journalApp.controller;

import com.journal.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.*;
@RestController
@RequestMapping("/heyy")
public class journalEntryControllerV2 {
    @GetMapping
    public List<JournalEntry> getAll(){
        return null;
    }
    @PostMapping
    public boolean creatEntry(@RequestBody JournalEntry myEntry){
        return true;
    }
    @GetMapping("id/{myId}")
    public JournalEntry getJournalEntryById(@PathVariable long Id){
        return null;
    }

    @DeleteMapping("id/{Id}")
    public JournalEntry deleteJournalEntryById(@PathVariable long Id) {
        return null;
    }

    @PutMapping("id/{Id}")
    public void updateJournalEntry(@PathVariable long Id, @RequestBody JournalEntry jr) {
    }
}
