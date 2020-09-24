package com.spring.hibernate.manyToMany;

import com.spring.hibernate.model.Course;
import com.spring.hibernate.model.Instructor;
import com.spring.hibernate.model.InstructorDetail;
import com.spring.hibernate.model.Review;
import com.spring.hibernate.model.Student;
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Instructor.class)
        .addAnnotatedClass(InstructorDetail.class)
        .addAnnotatedClass(Course.class)
        .addAnnotatedClass(Student.class)
        .addAnnotatedClass(Review.class)
        .buildSessionFactory();

    Session session = factory.getCurrentSession();

    try {

      session.beginTransaction();

      // Create course
      Course course = new Course("Node JS");
      Course course1 = new Course("Java");
      Course course2 = new Course("KAV");


      // Create student
      Student student = new Student("thah", "test", "test@gmail.com");
      Student student1 = new Student("test", "123 fdjslf", "test@gmail.com");
      Student student2 = new Student("tuan phong", "vn 888", "test@gmail.com");

      course.setStudents(Arrays.asList(student, student1, student2));

      session.save(student);
      session.save(student1);
      session.save(student2);

      Student st = session.get(Student.class, 3);
      st.setCourses(Arrays.asList(course,course1, course2));

      session.save(course);
      session.save(course1);
      session.save(course2);

      session.getTransaction().commit();


    } finally {
      session.close();
      factory.close();
    }
  }
}
