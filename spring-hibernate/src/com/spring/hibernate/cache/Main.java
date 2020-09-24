package com.spring.hibernate.cache;

import com.spring.hibernate.model.Course;
import com.spring.hibernate.model.Instructor;
import com.spring.hibernate.model.InstructorDetail;
import com.spring.hibernate.model.Review;
import com.spring.hibernate.model.Student;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Instructor.class)
        .addAnnotatedClass(InstructorDetail.class)
        .addAnnotatedClass(Student.class)
        .addAnnotatedClass(Course.class)
        .addAnnotatedClass(Review.class)
        .buildSessionFactory();

    Session session = factory.getCurrentSession();

    try {

      session.beginTransaction();
      Student st = session.get(Student.class, 3);
      System.out.println("get from DB" + st);
      Student st1 = session.get(Student.class, 3);
      System.out.println("from Cache: " + st1);

      session.evict(st);
      Student st2 = session.get(Student.class, 3);

      System.out.println("get from DB" + st2);

      session.getTransaction().commit();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      session.close();
      factory.close();
    }
  }
}
