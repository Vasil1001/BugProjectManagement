package com.BugTrackerApp.BugTracker.controller;

import com.BugTrackerApp.BugTracker.model.Student;
import com.BugTrackerApp.BugTracker.model.Student;
import com.BugTrackerApp.BugTracker.service.StudentService;
import com.BugTrackerApp.BugTracker.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/getAll") //RETURN TO HTML
    public String getAllModel(Model model) {
        List<Student> students = studentService.getAll();
        model.addAttribute("students", students);
        return "students"; //NAME OF HTML TO RETURN
    }


    @RequestMapping("/getAPI") //RETURN TO HTML
    public String getAll() {
        List<Student> students = studentService.getAll();
        return "students"; //NAME OF HTML TO RETURN
    }

    
    @PostMapping(value="/addNew")
    public String addNew(Student student) {
        studentService.addNew(student);
        return "redirect:/students/getAll";
    }

    @RequestMapping("/getOne")
    @ResponseBody
    public Optional<Student> getOne(Integer Id)
    {
        return studentService.getOne(Id);
    }

}
