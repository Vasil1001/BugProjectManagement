package com.BugTrackerApp.BugTracker.controller;

import com.BugTrackerApp.BugTracker.model.Project;
import com.BugTrackerApp.BugTracker.repository.ProjectRepository;
import com.BugTrackerApp.BugTracker.service.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private ProjectService projectService;

    @GetMapping("/")
    public String getAll(Model model) {
        List<Project> projectsList = projectService.getAll();

        model.addAttribute("projects", projectsList);
        return "redirect:/projects/getAll";
    }

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
