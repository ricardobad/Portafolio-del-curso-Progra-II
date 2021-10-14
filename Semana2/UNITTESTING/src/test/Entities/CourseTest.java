package test.Entities;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import Entities.Course;
import Entities.Teacher;
import org.junit.Assert.*;



public class CourseTest {
    @Test
    public void testCourseCOnstructorId(){
        Course course=new Course(123);
        assertEquals(course.getId(),123);
        }

    @Test

    public void testCourseConstructorName(){
        Course course= new Course("Progra II");
        assertEquals(course.getName(), "Progra II");

    }

    @Test

    public void testCourseConstructorIdName(){
        Course course = new Course("Programming II");
        assertEquals(course.getId(), "Programming II");
        assertEquals(course.getName(), 123);
    }

    @Test

    public void testTeacherSetter(){
        Teacher teacher =new Teacher();
        teacher.setFirstName("John");
        Course course = new Course(1, "Programming II");
        course.setTeacher(teacher);
        assertEquals(course.getTeacher().getFirstName(),"John");
    }
}
