package interview.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Course {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String title;
	private String instructor;
	private String department;
	private Integer numberOfRegistrations;
	
    @OneToMany(targetEntity= Classroom.class)  
	private List<Classroom> Classrooms;

    
    
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getInstructor() {
		return instructor;
	}

	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Integer getNumberOfRegistrations() {
		return numberOfRegistrations;
	}

	public void setNumberOfRegistrations(Integer numberOfRegistrations) {
		this.numberOfRegistrations = numberOfRegistrations;
	}

	public List<Classroom> getClassrooms() {
		return Classrooms;
	}

	public void setClassrooms(List<Classroom> classrooms) {
		Classrooms = classrooms;
	}
}
