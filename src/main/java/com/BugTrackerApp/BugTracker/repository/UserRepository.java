package com.BugTrackerApp.BugTracker.repository;

import com.BugTrackerApp.BugTracker.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Integer> {

}
