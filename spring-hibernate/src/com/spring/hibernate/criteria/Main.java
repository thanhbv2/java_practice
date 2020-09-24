package com.spring.hibernate.criteria;

import com.spring.hibernate.model.Course;
import com.spring.hibernate.model.Instructor;
import com.spring.hibernate.model.InstructorDetail;
import com.spring.hibernate.model.Review;
import com.spring.hibernate.model.Student;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
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

      CriteriaBuilder builder = session.getCriteriaBuilder();
      CriteriaQuery<Student> query = builder.createQuery(Student.class);
      Root<Student> root = query.from(Student.class);
//      Join<User, UserProfile> userJoin = root.join("userProfile", JoinType.LEFT);
      query.select(root);

      query.where(builder.and(builder.ge(root.get("id"), 1), builder.le(root.get("id"), 10)));
//      query.orderBy(builder.desc(root.get("firstName")));

      for (int i = 0; i < 5; i++) {
        List<Student> result = session.createQuery(query).setFirstResult(1).setMaxResults(5)
            .getResultList();

        System.out.println(result.size());
        System.out.println(result);
      }

      session.getTransaction().commit();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    } finally {
      session.close();
      factory.close();
    }
  }
}
