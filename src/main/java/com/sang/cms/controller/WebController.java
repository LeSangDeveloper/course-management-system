package com.sang.cms.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.sang.cms.model.Course;
import com.sang.cms.service.CourseService;

@Controller
public class WebController {

    private final CourseService service;

    public WebController(CourseService service) {
        this.service = service;
    }
	
	@GetMapping("/")
	public String index(Model model) {
        List<Course> courses = service.getAllCourses();
        model.addAttribute("courses", courses);
		return "view/index";
	}
	
}
