package com.journal.journalApp.entity;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.Date;

@Document(collection="journal_entries")
public class JournalEntry {
    @Id
    private ObjectId Id;
    private String title;
    private String content;
    private LocalDateTime date;
    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }
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

    public ObjectId getId() {
        return Id;
    }

    public void setId(ObjectId entry) {

        this.Id = entry;
    }

}
