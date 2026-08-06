package com.journal.journalApp.service;

import com.journal.journalApp.entity.JournalEntry;
import com.journal.journalApp.entity.User;
import com.journal.journalApp.repository.JournalEntryRepo;
import com.journal.journalApp.repository.UserEntryRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserEntryRepo UserRepo;

    public void saveEntry(User acc) {
        UserRepo.save(acc);
    }
    public List<User> getAll() {
        return UserRepo.findAll();
    }
    public Optional<User> FindUserById(ObjectId Id){
        return UserRepo.findById(Id);
    }
    public void AddUserByNamePass(User acc) {
        UserRepo.save(acc);
    }
    public void DelUserById(ObjectId Id) {
        UserRepo.deleteById(Id);
    }
    public User findByUserName(String username) {
        return UserRepo.findUserByName(username);
    }
}
