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

public class MainGet {

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
//      Student student = session.get(Student.class, 26);
//      System.out.println(student.getCourses().toString());
      for (int i = 0; i < 5; i++) {
        Course course = session.get(Course.class, 1);
        System.out.println(course.getStudents());

      }

//      session.delete(student);

      session.getTransaction().commit();


    } finally {
      session.close();
      factory.close();
    }
  }
}
