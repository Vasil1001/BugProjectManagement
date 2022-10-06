package com.BugTrackerApp.BugTracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "Home | BugTracker");
        return "home";
    }

    @RequestMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "About | BugTracker");
        return "about";
    }

    @RequestMapping("/login")
    public String login(Model model) {
        model.addAttribute("title", "Login | BugTracker");
        return "login";
    }

    @RequestMapping("/signup")
    public String signup(Model model) {
        model.addAttribute("title", "Sign Up | BugTracker");
        return "signup";
    }

    @RequestMapping("/selectProject")
    public String selectProject(Model model) {
        model.addAttribute("title", "Selected Project | BugTracker");
        return "selectProject";
    }
}
