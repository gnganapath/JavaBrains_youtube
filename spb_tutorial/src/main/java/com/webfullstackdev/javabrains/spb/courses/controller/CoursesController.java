package com.webfullstackdev.javabrains.spb.courses.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webfullstackdev.javabrains.spb.courses.model.Courses;
import com.webfullstackdev.javabrains.spb.courses.services.CoursesService;

@RestController
@RequestMapping("/api/v1")
public class CoursesController {
	

	@Autowired 
	CoursesService coursesService;
	
	//GET 
	@GetMapping("/courses")
	public List<Courses> getAllCourses(){
		return coursesService.getAllCourseService();
	}
	
	//POST 
	@PostMapping("/courses")
	public Courses postNewCourse(@RequestBody Courses course) {
		return coursesService.addNewCourseService(course);
	}
	
	//PUT 
	@PutMapping("/courses/{updateCourseId}")
	public ResponseEntity<Courses> updateCourse(@PathVariable Long updateCourseId, @RequestBody Courses updatesInCourseDetail) {
		return coursesService.updateCourseDetailService(updateCourseId, updatesInCourseDetail);
	}
		
	//DELETE 
	@DeleteMapping("/courses/{deleleteCourseID}")
	public ResponseEntity< Map <String , Boolean> > deleteCourseById(@PathVariable Long deleleteCourseID){
		return coursesService.deleteCourseService(deleleteCourseID);
	}
	
	//GET - view
	@GetMapping("/courses/{courseID}")
	public Courses viewCourse(@PathVariable Long courseId) {
		return coursesService.findCourseDetailService(courseId);
	}

}
