package interview.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import interview.model.Classroom;

@RepositoryRestResource(collectionResourceRel = "classrooms", path = "classrooms")
public interface ClassroomRepository extends CrudRepository<Classroom, String> {

}

