package interview.controller;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import interview.exception.FindDataException;
import interview.model.Classroom;
import interview.model.Course;
import interview.repository.ClassroomRepository;
import interview.repository.CourseRepository;
import interview.service.IClassroomService;

@RestController
public class ClassroomController {

    @Autowired  
    private IClassroomService iClassroomService;
	@Autowired  
    private CourseRepository courseRepository;
    /**
     * Find all available classroom for the given course.
     * @param courseId ID of the given course.
     * @return list of classrooms available
     */
	public List<Classroom> getAvailableClassrooms(@RequestParam Integer courseId) {
		// TODO replace below with implementation
		return iClassroomService.findAllClassRooms(courseId);
	}
        
    /**
     * Reserve an available classroom for the given course.
     * @param courseId ID of the given course.
     * @return classroom reserved
     */
	public String reserveClassroom(@RequestParam Integer courseId) {
		// TODO replace below with implementation	
		Course courseData = courseRepository.findById(String.valueOf(courseId)).orElseThrow(() -> new FindDataException(""));
		String department = courseData.getDepartment();
		
		List<Classroom> classRooms = iClassroomService.findAllClassRooms(courseId);
		List<Classroom> classRooms2 = new LinkedList<Classroom>();
		for(Classroom classRoom : classRooms)
		{
			classRoom.setDepartment(department);
			classRooms2.add(classRoom);
		}
		courseData.setClassrooms(classRooms2);
		return iClassroomService.reserveClassroom(courseData);
	}

    /**
     * Reserve available classrooms for the given courses.
     * @param courseIds list of IDs of the given courses.
     * @return classrooms reserved
     */
	public List<Classroom> reserveClassrooms(@RequestParam List<Integer> courseIds) {
		// TODO replace below with implementation
		
		//List<Course> courses = courseRepository.findAllById(courseIds);
		return null;
	}


}