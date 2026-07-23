package com.journal.journalApp.entity;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class JournalEntry {
    private String entry;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    private String title;
    private String content;
}
