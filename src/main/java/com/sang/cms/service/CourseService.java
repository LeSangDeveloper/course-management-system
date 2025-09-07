package com.sang.cms.service;

import java.util.List;

import com.sang.cms.model.Course;

public interface CourseService {

    public void createCourse(Course course);

    public List<Course> getAllCourses();
	
}
