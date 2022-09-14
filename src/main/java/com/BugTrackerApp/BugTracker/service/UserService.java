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
    
    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();
        userRepository.findAll().forEach(users::add);
        return users;
    }

    public void addNew(User user) {
        userRepository.save(user);
    }

    public void deleteUser(String id) {
        userRepository.deleteById(id);
    }

    public Optional<User> getOne(String id) {
        return userRepository.findById(id);
    }

    //////////////////////////////////////////////
//    public Optional<User> getUser(String id) {
//        return userRepository.findById(id);
//    }
//
//    public void addUser(User User) {
//        userRepository.save(User);
//    }
//
//    public void updateUser(String id, User User) {
//        userRepository.save(User);
//    }
//
//    public void deleteUser(String id) {
//        userRepository.deleteById(id);
//    }


}
