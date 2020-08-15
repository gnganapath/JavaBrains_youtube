package com.webfullstackdev.javabrains.spb.courses.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.webfullstackdev.javabrains.spb.courses.dao.CoursesDao;
import com.webfullstackdev.javabrains.spb.courses.model.Courses;

@Service
public class CoursesService {
	
	@Autowired
	CoursesDao courseRepository;
	
	//get- course rest call	
	public List<Courses> getAllCourseService(){
		return courseRepository.findAll();
	}
	
	//post- add new course rest call
	public Courses addNewCourseService(Courses course) {
		return courseRepository.save(course);
	}
	
	//get- getCourseById rest call
	public Courses findCourseDetailService( Long courseId) {
		return courseRepository.findById(courseId).orElseThrow();
	}
	
	//put- update CourseById rest call
	public ResponseEntity<Courses> updateCourseDetailService( Long updateCourseId, Courses updateCourseDetails){
		
		Courses findCourseToUpdate;		
		
		findCourseToUpdate = courseRepository.findById(updateCourseId).orElseThrow();
		
		findCourseToUpdate.setCourseName(updateCourseDetails.getCourseName());
		findCourseToUpdate.setCoursePrice(updateCourseDetails.getCoursePrice());
		
		Courses mergedCourse = courseRepository.save(findCourseToUpdate);
		return ResponseEntity.ok(mergedCourse);
	}
	
	// delete - remove by courseId rest all	
	public ResponseEntity< Map <String, Boolean>> deleteCourseService(Long deleteCourseId){
		Courses deleteCourse;
		
		deleteCourse = courseRepository.findById(deleteCourseId).orElseThrow();
		courseRepository.delete(deleteCourse);
		Map < String, Boolean > response = new HashMap < > ();
        response.put("deleted the Course", Boolean.TRUE );
		return null;		
	}
	
}
