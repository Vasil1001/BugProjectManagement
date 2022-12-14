package com.BugTrackerApp.BugTracker.service;

import com.BugTrackerApp.BugTracker.model.User;
import com.BugTrackerApp.BugTracker.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    public UserRepository userRepository;

    public List<User> getAll() {
        return (List<User>) userRepository.findAll();
    }

    public void addNew(User user) {
        userRepository.save(user);
    }

    public Optional<User> getOne(Integer id) {
        return userRepository.findById(id);
    }

    public void update(User user) {
        userRepository.save(user);
    }

    public void delete(Integer id) {
        userRepository.deleteById(id);
    }
}
