package com.journal.journalApp.controller;

import com.journal.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
@RequestMapping("/heyy")
public class journalEntryController {
    private HashMap<Long,JournalEntry> journalEntries = new HashMap<>();
    @GetMapping("/abc")
    public List<JournalEntry> getAll(){
        List<JournalEntry> res = new ArrayList<>(journalEntries.values());
        return res;
    }
    @PostMapping
    public void creatEntry(){

    }
}
