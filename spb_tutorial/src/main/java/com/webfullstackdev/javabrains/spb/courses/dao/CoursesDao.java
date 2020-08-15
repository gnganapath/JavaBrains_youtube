package com.webfullstackdev.javabrains.spb.courses.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webfullstackdev.javabrains.spb.courses.model.Courses;

public interface CoursesDao extends JpaRepository<Courses , Long>{
	
}
