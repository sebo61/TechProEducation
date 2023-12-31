package com.tpe.hb14.entity_life_cycle;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class RunnerSave14 {
    public static void main(String[] args) {

        Student14 student1=new Student14();//Transient--tabloda bir satıra karşılık gelmez
        student1.setName("Jack");
        student1.setGrade(100);

        Student14 student2=new Student14();//Transient
        student2.setName("Harry");
        student2.setGrade(100);

        Configuration config=new Configuration().configure().
                addAnnotatedClass(Student14.class);


        SessionFactory sf=config.buildSessionFactory();
        Session session =sf.openSession();
        Transaction tx =session.beginTransaction();

        session.persist(student1);//persisted/managed
        student1.setName("Sherlock");

        session.evict(student1);//objeyi detach eder



        tx.commit();
        session.close();

        student1.setName("Ahmet");//detached--tabloda bir satıra karşılık gelir

        sf.close();


    }

}