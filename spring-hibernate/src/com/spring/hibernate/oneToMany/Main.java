package com.spring.hibernate.oneToMany;

import com.spring.hibernate.model.Course;
import com.spring.hibernate.model.Instructor;
import com.spring.hibernate.model.InstructorDetail;
import com.spring.hibernate.model.Review;
import com.spring.hibernate.model.Student;
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
      Course course = session.get(Course.class, 1);
      System.out.println(course);
      System.out.println(course.getInstructor().getFirstName());

//      Course course1 = new Course("vdfjsdlaf");R
//      Course course2 = new Course("vdfjsdlaf");
//      instructor.add(course1);
//      instructor.add(course2);
//      // Save all with cascade all
//      session.save(course1);
//      session.save(course2);

      // Detete
//      Course course = session.get(Course.class, 3);
//      if (course != null) {
//        session.delete(course);
//      }
      session.getTransaction().commit();


    } finally {
      session.close();
      factory.close();
    }
  }

}
