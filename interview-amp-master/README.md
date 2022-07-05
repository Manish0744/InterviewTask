A simple web app server providing REST APIs for web clients, using Spring Boot and H2 in-memory DB.

Assume we have a table of all courses for the semester, and a table of all classrooms on campus:
* All courses follow a weekly schedule, meet once a week at a certain hour on a certain weekday, and last 1 hour.
* The number of students registered for a course is known.
* Each course is offered by a particular department.
* Each classroom belongs to a certain department.
* A classroom can only be reserved for courses offered by its own department.
* The seat capacity of each classroom is known.

A skeleton of the project is provided on the master branch. Create a feature branch from master, and complete the code to provide the following APIs for classroom reservation. Feel free to add new or change existing fields, annotations, methods, classes etc. When you are done, commit your feature branch to the repository.

* Given a course, find all avaiable classrooms.
* Given a course, find an available classroom and reserve it for the course.
* Implement a strategy to reserve classrooms for all courses to the extent possible.

