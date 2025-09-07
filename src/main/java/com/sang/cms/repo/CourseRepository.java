package com.sang.cms.repo;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sang.cms.model.Course;

@Repository
public class CourseRepository {

	private final JdbcTemplate jdbcTemplate;
	
	public CourseRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
    public List<Course> findAll() {
        String sql = "SELECT course_id, title FROM course";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Course.class));
    }
	
}
