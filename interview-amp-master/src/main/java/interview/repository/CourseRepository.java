package interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import interview.model.Course;

@RepositoryRestResource(collectionResourceRel = "courses", path = "courses")
public interface CourseRepository extends CrudRepository<Course, String> {

}
