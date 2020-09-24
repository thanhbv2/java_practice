package com.spring.hibernate.oneToMany;

import com.spring.hibernate.model.Course;
import com.spring.hibernate.model.Instructor;
import com.spring.hibernate.model.InstructorDetail;
import com.spring.hibernate.model.Review;
import java.util.Arrays;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainUniDirection {

  public static void main(String[] args) {

    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Instructor.class)
        .addAnnotatedClass(InstructorDetail.class)
        .addAnnotatedClass(Course.class)
        .addAnnotatedClass(Review.class)
        .buildSessionFactory();

    Session session = factory.getCurrentSession();

    try {

      session.beginTransaction();
      Course course = new Course("hello");
      Review review = new Review("vmvmmv");
      Review review2 = new Review("13123");
      Review review3 = new Review("321321");

      course.setReviews(Arrays.asList(review, review2, review3));

      session.save(course);

      Course getCourse = session.get(Course.class, 4);
      System.out.println(getCourse.getReviews());

      session.delete(getCourse);

      session.getTransaction().commit();


    } finally {
      session.close();
      factory.close();
    }
  }

}
