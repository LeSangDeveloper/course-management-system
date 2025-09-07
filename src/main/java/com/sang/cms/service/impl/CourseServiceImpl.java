package com.sang.cms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sang.cms.model.Course;
import com.sang.cms.repo.CourseRepository;
import com.sang.cms.service.CourseService;

@Service
public class CourseServiceImpl implements CourseService {

    private final CourseRepository repo;

    public CourseServiceImpl(CourseRepository repo) {
        this.repo = repo;
    }

    public List<Course> getAllCourses() {
        return repo.findAll();
    }

	@Override
	public void createCourse(Course course) {
		// TODO Auto-generated method stub
		
	}

}
