package com.BugTrackerApp.BugTracker.controller;

import com.BugTrackerApp.BugTracker.model.Project;
import com.BugTrackerApp.BugTracker.model.Ticket;
import com.BugTrackerApp.BugTracker.model.User;
import com.BugTrackerApp.BugTracker.service.ProjectService;
import com.BugTrackerApp.BugTracker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private ProjectService projectService;
    
    @RequestMapping("/getAll") // RETURN TO HTML
    public String getAllModel(Model model) {
        List<User> users = userService.getAll();
        List<Project> projects = projectService.getAll();

        model.addAttribute("users", users);
        model.addAttribute("projects", projects);

        return "users"; // NAME OF HTML TO RETURN
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<User> getOne(Integer Id) {
        return userService.getOne(Id);
    }

    @PostMapping(value = "/addNew")
    public String addNew(User user) {
        userService.addNew(user);
        return "redirect:/users/getAll";
    }

    @RequestMapping(value = "/update", method = {RequestMethod.PUT, RequestMethod.GET})
    public String update(User user) {
        userService.update(user);
        return "redirect:/users/getAll";
    }

    @RequestMapping(value = "/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
    public String delete(Integer Id) {
        userService.delete(Id);
        return "redirect:/users/getAll";
    }
    ///

    // @RequestMapping(value = "/GetUsers")
    // public List<User> getAllUsers() {
    // return userService.getAllUsers();
    // }
    // @RequestMapping(value = "/Users/{id}")
    // public Optional<User> getUser(@PathVariable String id) {
    // return userService.getUser(id);
    // }
    // @RequestMapping(value = "/Users", method = RequestMethod.POST)
    // public void addUser(@RequestBody User User) {
    // userService.addUser(User);
    // }
    // @RequestMapping(value = "/Users/{id}", method = RequestMethod.PUT)
    // public void updateUser(@PathVariable String id, @RequestBody User User) {
    // userService.updateUser(id, User);
    // }
    // @RequestMapping(value = "/Users/delete/{id}", method = RequestMethod.DELETE)
    // public void deleteUser(@PathVariable String id) {
    // userService.deleteUser(id);
    // }
}
