package com.webfullstackdev.javabrains.spb.courses.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Courses")

public class Courses {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name ="course_name")
	private String courseName;
	
	@Column(name = "course_price")
	private long coursePrice;
	
	public Courses() {
	
	}	
	public Courses(String courseName, long coursePrice) {
		super();
		this.courseName = courseName;
		this.coursePrice = coursePrice;
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public long getCoursePrice() {
		return coursePrice;
	}
	public void setCoursePrice(long coursePrice) {
		this.coursePrice = coursePrice;
	}

}
