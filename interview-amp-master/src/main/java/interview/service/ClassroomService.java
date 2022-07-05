package interview.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interview.exception.FindDataException;
import interview.model.Classroom;
import interview.model.Course;
import interview.repository.ClassroomRepository;
import interview.repository.CourseRepository;

@Service
public class ClassroomService implements IClassroomService{
	
	@Autowired  
    private CourseRepository courseRepository;
    
    @Autowired  
    private ClassroomRepository classroomRepository;
	

	@Override
	public List<Classroom> findAllClassRooms(int courseId) {			
		Course courseData = courseRepository.findById(String.valueOf(courseId)).orElseThrow(() -> new FindDataException(""));

		List<Classroom> classRooms = courseData.getClassrooms();
		
		return classRooms;
	}


	@Override
	public String reserveClassroom(Course course) {
		Course courseData =  courseRepository.save(course);
		return "Course has been reserved for classroom which department is : " + courseData.getDepartment();
	}

}
