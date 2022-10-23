package com.BugTrackerApp.BugTracker;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping(value = "/")
    public static String index() {
        return "projects/getAll";
    }
}