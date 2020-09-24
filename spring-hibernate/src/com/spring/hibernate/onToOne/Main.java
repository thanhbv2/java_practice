package com.spring.hibernate.onToOne;

import com.spring.hibernate.model.Course;
import com.spring.hibernate.model.Instructor;
import com.spring.hibernate.model.InstructorDetail;
import com.spring.hibernate.model.Review;
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
        .addAnnotatedClass(Review.class)
        .buildSessionFactory();

    Session session = factory.getCurrentSession();

    try {


      session.beginTransaction();
      Instructor instructor = new Instructor("vn", "vn", "test@gmail.com");
      InstructorDetail detail = new InstructorDetail("host/vom", "test");
      instructor.setInstructorDetail(detail);
      // Save all with cascade all
      session.save(instructor);

      //Detete
      InstructorDetail instructor1 = session.get(InstructorDetail.class, 3);

      if(instructor1 != null){
        session.delete(instructor1);
      }

      session.getTransaction().commit();



    }finally {
      session.close();
      factory.close();
    }
  }

}
