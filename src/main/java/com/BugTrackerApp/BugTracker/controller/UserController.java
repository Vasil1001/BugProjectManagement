package com.BugTrackerApp.BugTracker.controller;

import com.BugTrackerApp.BugTracker.model.Student;
import com.BugTrackerApp.BugTracker.model.User;
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

    @RequestMapping("/getAll") //RETURN TO HTML
    public String getAllModel(Model model) {
        List<User> users = userService.getAll();
        model.addAttribute("users", users);
        return "users"; //NAME OF HTML TO RETURN
    
    }
    
    @RequestMapping("/getAPI") //RETURN TO HTML
    public String getAll() {
        List<User> users = userService.getAll();
        return "users"; //NAME OF HTML TO RETURN
    }
    
    @PostMapping(value="/addNew")
    public String addNew(User user) {
        userService.addNew(user);
        return "redirect:/users/getAll";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<User> getOne(String Id)
    {
        return userService.getOne(Id);
    }





    ///

//    @RequestMapping(value = "/GetUsers")
//    public List<User> getAllUsers() {
//        return userService.getAllUsers();
//    }
//    @RequestMapping(value = "/Users/{id}")
//    public Optional<User> getUser(@PathVariable String id) {
//        return userService.getUser(id);
//    }
//    @RequestMapping(value = "/Users", method = RequestMethod.POST)
//    public void addUser(@RequestBody User User) {
//        userService.addUser(User);
//    }
//    @RequestMapping(value = "/Users/{id}", method = RequestMethod.PUT)
//    public void updateUser(@PathVariable String id, @RequestBody User User) {
//        userService.updateUser(id, User);
//    }
//    @RequestMapping(value = "/Users/delete/{id}", method = RequestMethod.DELETE)
//    public void deleteUser(@PathVariable String id) {
//        userService.deleteUser(id);
//    }
}
