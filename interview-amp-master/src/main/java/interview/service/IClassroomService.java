package interview.service;

import java.util.List;

import interview.model.Classroom;
import interview.model.Course;

public interface IClassroomService {

	List<Classroom> findAllClassRooms(int courseId);
	
	String reserveClassroom(Course course);
	
}
