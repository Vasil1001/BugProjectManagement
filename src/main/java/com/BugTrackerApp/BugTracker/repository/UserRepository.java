package com.BugTrackerApp.BugTracker.repository;

import com.BugTrackerApp.BugTracker.model.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

}
