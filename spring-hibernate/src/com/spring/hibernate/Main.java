package com.spring.hibernate;

import com.spring.hibernate.model.Student;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

  public static void main(String[] args) {
    SessionFactory factory = new Configuration()
        .configure("hibernate.cfg.xml")
        .addAnnotatedClass(Student.class).buildSessionFactory();

    Session session = factory.getCurrentSession();

    try {
      Student student = new Student("test", "lastname", "test@gmail.com");
      Student student1 = new Student("test2", "lastname111", "tes212t@gmail.com");
      Student student2 = new Student("test3", "lastname3212", "tes212t@gmail.com");

      session.beginTransaction();
      //Create
      session.save(student);
      session.save(student1);
      session.save(student2);
      // Get with condition
      List<Student> ls = session.createQuery("from Student s where lastName='lastname'")
          .getResultList();
      List<Student> lsAll = session.createQuery("from Student").list();

      // Update
      Student st = session.get(Student.class, 1);
      st.setEmail("thanh.buivan");

      // delete
      session.delete(st);

      session.getTransaction().commit();

    }finally {

      factory.close();
    }
  }
}
